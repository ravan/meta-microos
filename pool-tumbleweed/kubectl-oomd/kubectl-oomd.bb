SUMMARY = "Show pods/containers which have recently been 'OOMKilled'"
DESCRIPTION = "kubectl plugin to display the pods and containers which have recently been OOMKilled."
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "kubectl-oomd-0.0.7-1.21.aarch64.rpm"
RPM_HASH = "ef3461ad1f1a599880ff612366a12a103e89bc42b9133b85888a3d8a923ca634031d5c0db3e3356db420ca19470cf18c15973c4c5e06d450e0cfbfffabf4ea51"

RPROVIDES:${PN} += "kubectl-oomd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
