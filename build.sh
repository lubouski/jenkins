#!/bin/bash

NAME=${@:2}
VERSION=$1

for value in $NAME
do 
    echo $value-$VERSION
done
