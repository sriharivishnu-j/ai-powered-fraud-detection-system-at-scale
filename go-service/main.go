package main

import (
	"fmt"
	"log"
	net/http"
)

func main() {
	http.HandleFunc("/preprocess", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, "Data Preprocessing and Feature Extraction")
	})

	log.Fatal(http.ListenAndServe(":8081", nil))
}
