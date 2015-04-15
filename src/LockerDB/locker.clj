(ns LockerDB.locker
  (:gen-class))

"Initialises a new locker for bag storage."
(def locker hash-map)

(defn makeBag
  "Makes a new empty bag and puts it in the locker."
  [bagName]
  (conj locker {:bagName hash-map})
  (def currentBag :bagName))

(defn getCurrentBag
  "Returns the name of the currently used bag."
  []
  (currentBag))

(defn switchBag
  "Swaps current bag for specified bag.
  TODO: handle nil"
  [bagName]
  (def currentBag (locker :bagName)))

(defn showLockerContents
  "Shows all bags currently in locker."
  []
  (locker))


