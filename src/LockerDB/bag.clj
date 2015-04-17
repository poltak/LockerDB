(ns LockerDB.bag
  (:gen-class))

(defn openBag
  "Opens bag revealing its contents."
  [bag]
  (bag))

(defn addItem
  "Adds a new item into the bag."
  [bag itemKey itemVal]
  (merge bag {:itemKey itemVal}))

(defn removeItem
  "Removes an existing item from the bag."
  [bag itemKey]
  (remove (= :itemKey) bag))

(defn getItem
  "Gets an existing item from the bag."
  [bag itemKey]
  (:itemKey bag))



