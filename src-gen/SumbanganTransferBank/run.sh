#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.sumbangantransferbank --module-path aisco.product.sumbangantransferbank -m aisco.product.sumbangantransferbank &

wait