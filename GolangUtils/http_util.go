package GolangUtils

import (
	"bytes"
	"io"
	"io/ioutil"
	"log"
	"net/http"
	"os"
)

func saveImgFromURL(imgUrl string, path string) (err error) {
	resp, err := http.Get(imgUrl)
	if err != nil {
		log.Fatal(err.Error())
		return
	}
	body, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		log.Fatal(err.Error())
		return
	}
	out, err := os.Create(path)
	if err != nil {
		log.Fatal(err.Error())
		return
	}
	_, err = io.Copy(out, bytes.NewReader(body))
	if err != nil {
		log.Fatal(err.Error())
		return
	}
	return
}
