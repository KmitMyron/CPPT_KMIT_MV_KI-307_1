package Laboratorna;
//В файлі Button.java
public class Button
{
 private String action;

 public Button(String action) {
     this.action = action;
 }

 public String getAction() {
     return action;
 }

 public void setAction(String action) {
     this.action = action;
 }

 @Override
 public String toString() {
     return "Button{ " +
             "action = '" + action + '\'' +
             '}';
 }
}
