(ns capy.bara
  (:require [reagent.core :as reagent]
            [reagent.dom :as reagent-dom]))

(def state (reagent/atom {:i 0}))

(defn my-first-component []
  [:section
   [:div "counter:" (:i @state)]
   [:button {:on-click #(swap! state update :i inc)} "+"]])

(reagent-dom/render [my-first-component]
                    (js/document.getElementById "app"))
