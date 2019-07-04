
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.html.default("So this is my first attempt at an audit trail in Scala", "Replace all this with swagger!")/*2.114*/{_display_(Seq[Any](format.raw/*2.115*/("""
  """),format.raw/*3.3*/("""<p><a href="/asset/foo">asset endpoint</a></p>
  <p><a href="/asset/all">all assets endpoint</a></p>
  <p><a href="/event/foo">event endpoint</a></p>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 04 20:31:11 BST 2019
                  SOURCE: /Users/phillipbarron/workspace/scalatra-audit-trail/src/main/twirl/views/hello.scala.html
                  HASH: a4aa54620b90b38e59850bce822c68d93560a781
                  MATRIX: 559->1|655->3|682->5|696->12|810->117|849->118|878->121
                  LINES: 14->1|19->1|20->2|20->2|20->2|20->2|21->3
                  -- GENERATED --
              */
          