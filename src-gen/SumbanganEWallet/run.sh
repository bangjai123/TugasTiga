#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.sumbanganewallet --module-path aisco.product.sumbanganewallet -m aisco.product.sumbanganewallet &

wait