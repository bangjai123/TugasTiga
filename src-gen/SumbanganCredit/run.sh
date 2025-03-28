#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.sumbangancredit --module-path aisco.product.sumbangancredit -m aisco.product.sumbangancredit &

wait