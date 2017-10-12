package Environnement;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{
	static public String text="";
	
	public static Environnement environnement;
	public static void main(String [ ] args) {
		environnement = new Environnement();
		Template Agent1 = new Template();
		Agent1.number=1;
		Template Agent2 = new Template();
		Agent2.number=2;
		Template Agent3 = new Template();
		Agent3.number=3;
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		VBox root=new VBox();
		
		TexteAffichier cac40 = new TexteAffichier();
		TexteAffichier2 dax = new TexteAffichier2();
		TexteAffichier3 nasdaq = new TexteAffichier3();
		TexteAffichier4 nikkei = new TexteAffichier4();
		TexteAffichier5 downjones = new TexteAffichier5();
		TexteAffichier6 annonce = new TexteAffichier6();
		root.getChildren().addAll(cac40,dax,nasdaq,nikkei,downjones,annonce);
		Scene value = new Scene(root, 300,450);
		stage.setScene(value);
	    stage.show();
		
	}
	class TexteAffichier extends Label {
		  public TexteAffichier() {
		    bindToTime();
		  }

		  // the digital clock updates once a second.
		  private void bindToTime() {
		    Timeline timeline = new Timeline(
		      new KeyFrame(Duration.seconds(0),
		        new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent actionEvent) {
		        	  setText("CAC_40 : "+String.valueOf(Main.environnement.CAC_40.indice));
		          }
		        }
		      ),
		      new KeyFrame(Duration.seconds(1))
		    );
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		  }
		}
	class TexteAffichier2 extends Label {
		  public TexteAffichier2() {
		    bindToTime();
		  }

		  // the digital clock updates once a second.
		  private void bindToTime() {
		    Timeline timeline = new Timeline(
		      new KeyFrame(Duration.seconds(0),
		        new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent actionEvent) {
		        	  setText("DAX : "+String.valueOf(Main.environnement.DAX.indice));
		          }
		        }
		      ),
		      new KeyFrame(Duration.seconds(1))
		    );
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		  }
		}
	class TexteAffichier3 extends Label {
		  public TexteAffichier3() {
		    bindToTime();
		  }

		  // the digital clock updates once a second.
		  private void bindToTime() {
		    Timeline timeline = new Timeline(
		      new KeyFrame(Duration.seconds(0),
		        new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent actionEvent) {
		        	  setText("Dow_Jones : "+String.valueOf(Main.environnement.Dow_Jones.indice));
		          }
		        }
		      ),
		      new KeyFrame(Duration.seconds(1))
		    );
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		  }
		}
	class TexteAffichier4 extends Label {
		  public TexteAffichier4() {
		    bindToTime();
		  }

		  // the digital clock updates once a second.
		  private void bindToTime() {
		    Timeline timeline = new Timeline(
		      new KeyFrame(Duration.seconds(0),
		        new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent actionEvent) {
		        	  setText("NIKKEI : "+String.valueOf(Main.environnement.NIKKEI.indice));
		          }
		        }
		      ),
		      new KeyFrame(Duration.seconds(1))
		    );
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		  }
		}
	class TexteAffichier5 extends Label {
		  public TexteAffichier5() {
		    bindToTime();
		  }

		  // the digital clock updates once a second.
		  private void bindToTime() {
		    Timeline timeline = new Timeline(
		      new KeyFrame(Duration.seconds(0),
		        new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent actionEvent) {
		        	  setText("NASDAQ : "+String.valueOf(Main.environnement.NASDAQ.indice));
		          }
		        }
		      ),
		      new KeyFrame(Duration.seconds(1))
		    );
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		  }
		}
	class TexteAffichier6 extends Label {
		  public TexteAffichier6() {
		    bindToTime();
		  }

		  // the digital clock updates once a second.
		  private void bindToTime() {
		    Timeline timeline = new Timeline(
		      new KeyFrame(Duration.seconds(0),
		        new EventHandler<ActionEvent>() {
		          @Override public void handle(ActionEvent actionEvent) {
		        	  setText(text);
		          }
		        }
		      ),
		      new KeyFrame(Duration.seconds(1))
		    );
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		  }
		}
	
}
