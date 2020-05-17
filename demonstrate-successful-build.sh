#!/bin/bash
docker run --rm -v "$PWD":/usr/src/app kernald/bazel bazel run lombok-idea-val-bug
