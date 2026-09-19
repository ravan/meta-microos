SUMMARY = "Bootstrap Kubernetes with k3s over SSH < 1 min"
DESCRIPTION = "k3sup is a light-weight utility to get from zero to KUBECONFIG with k3s on any \
local or remote VM. All you need is ssh access and the k3sup binary to get \
kubectl access immediately. \
The tool is written in Go and is cross-compiled for Linux, Windows, MacOS and \
even on Raspberry Pi. \
How do you say it? Ketchup, as in tomato."
LICENSE = "MIT"

PV = "0.13.12"

RPM_NAME = "k3sup-0.13.12-1.6.aarch64.rpm"
RPM_HASH = "ab67037cf9ba100155abfbd78f430ae80f5b097c0fcd3264056949a04cbffb6efc675d2951a2dd5a1f87de37009640982cbc4340d1249643d172103368197175"

RPROVIDES:${PN} += "k3sup"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
