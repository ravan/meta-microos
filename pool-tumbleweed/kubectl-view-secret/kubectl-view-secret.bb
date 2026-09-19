SUMMARY = "Kubernetes CLI plugin to decode Kubernetes secrets"
DESCRIPTION = "This plugin allows for easy secret decoding. Useful if you want to see what's \
inside of a secret without always go through the following: \
 \
* kubectl get secret <secret> -o yaml \
* Copy base64 encoded secret \
* echo 'b64string' | base64 -d"
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "kubectl-view-secret-0.16.0-1.4.aarch64.rpm"
RPM_HASH = "0d5b4f757ecfa18a2be3654ed86cf33caac5389809679367411eccc52e6f694d308521b32e06a84671470ef56ede0c91434bf221f7c203c855be4a026f729241"

RPROVIDES:${PN} += "kubectl-view-secret"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
