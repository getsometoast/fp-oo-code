;; function to square a number:
(defn sqaure [n]
  (* n n))

;; little schemer inspired version of add-squares:
(defn add-squares [l]
  (cond
    (empty? l) '()
    :else (+ (square (first l)) (add-squares (rest l)))))

(add-squares '(2 2 2 2))

;; alternate version applying the + function to the value of map square l.
;; map square l will return a seq containing the result of applying square to 
;; all values in l.
(defn add-squares [l]
  (apply + (map square l)))

(add-squares '(2 2 2 2))


