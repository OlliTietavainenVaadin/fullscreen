import '@polymer/polymer/polymer-legacy.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import { PolymerElement } from '@polymer/polymer/polymer-element.js';
class FullscreenButton extends PolymerElement {
  static get template() {
    return html`
   <style include="shared-styles">
            :host {
                display: block;
            }
        </style> 
   <vaadin-button id="fullscreen-vaadin-button" on-click="onclick"> 
   </vaadin-button> 
`;
  }

  static get is() {
      return 'fullscreen-button';
  }

  static get properties() {
      return {
          close: {
              type: Boolean,
              value: false
          }
      };
  }
  onclick() {
      var elem = document.documentElement;
      if (this.close) {
         if (document.exitFullscreen) {
             document.exitFullscreen();
         } else if (document.mozCancelFullScreen) { /* Firefox */
             document.mozCancelFullScreen();
         } else if (document.webkitExitFullscreen) { /* Chrome, Safari and Opera */
             document.webkitExitFullscreen();
         } else if (document.msExitFullscreen) { /* IE/Edge */
             document.msExitFullscreen();
         }
     } else {
         if (elem.requestFullscreen) {
             elem.requestFullscreen();
         } else if (elem.mozRequestFullScreen) { /* Firefox */
             elem.mozRequestFullScreen();
         } else if (elem.webkitRequestFullscreen) { /* Chrome, Safari and Opera */
             elem.webkitRequestFullscreen();
         } else if (elem.msRequestFullscreen) { /* IE/Edge */
             elem.msRequestFullscreen();
         }
     }
  }
}
customElements.define(FullscreenButton.is, FullscreenButton);

