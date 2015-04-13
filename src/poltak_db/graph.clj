(ns PoltakDB.graph
  (:gen-class))

(defn initGraph
  "Initialises an empty graph."
  (hash-map))

(defn addEdge
  "Adds an edge between two existing vertices in the graph."
  [graph vertexA vertexB]
  (merge graph
    {:vertexA ->  graph :vertexA
                  (conj vertexB)
                  vec
     :vertexB ->  graph :vertexB
                  (conj vertexA)
                  vec}))
    "
     {:vertexA (vec (conj (:vertexA graph) vertexB))
      :vertexB (vec (conj (:vertexB graph) vertexA))}))
     "

(defn addVertex
  "Adds a vertex in the graph."
  [graph value adjacentVertices]
  (merge graph {:value adjacentVertices}))


(defn -main
  "Testing main method."
  [& args]
  (def graph initGraph)
  (addVertex graph "hi" []))
