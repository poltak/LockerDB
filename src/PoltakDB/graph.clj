(ns PoltakDB.graph
  (:gen-class))

(defn initGraph
  "Initialises an empty graph."
  []
  (hash-map))

(defn addEdge
  "Adds an edge between two existing vertices in the graph."
  [graph vertexA vertexB]
  (merge graph
    {:vertexA (vec (conj (:vertexA graph) vertexB))
     :vertexB (vec (conj (:vertexB graph) vertexA))}))
         "
    {:vertexA ->  graph :vertexA
                  (conj vertexB)
                  vec
     :vertexB ->  graph :vertexB
                  (conj vertexA)
                  vec}))
    }"


(defn addVertex
  "Adds a vertex in the graph."
  [graph value adjacentVertices]
  (merge graph {:value adjacentVertices}))

"
(defn removeEdge
Removes an existing edge in the graph. TODO
  [graph vertexA vertexB]
  ((remove (= vertex vertexB) (:vertexA graph))
   (remove (= vertex vertexA) (:vertexB graph))))
                                              "

(defn neighbours
  "Lists all adjacent vertices to given vertex in graph."
  [graph vertex]
  (:vertex graph))

"(defn adjacent"
  "Tests whether or not two given vertices are adjacent in graph."
  "
  [graph vertexA vertexB]
  (and
    (in (:vertexA graph) vertexB)
    (in (:vertexB graph) vertexA)))
  "
