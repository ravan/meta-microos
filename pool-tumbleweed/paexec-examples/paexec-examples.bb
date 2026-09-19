SUMMARY = "Examples for paexec"
DESCRIPTION = "A program that processes a list of tasks in parallel \
on different CPUs, computers in a network or whatever else. \
 \
This package contains examples for paexec."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "paexec-examples-1.1.6-1.9.noarch.rpm"
RPM_HASH = "39ce9fa2add44a0edde77e0523890042bc38cd13fb1870a5b6a2ddfd3c01d82c5000eb893161035ec5fcab8a08a0154cf4e455dc397f13a8946ede9cb875a323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paexec-examples"

RDEPENDS:${PN} += "paexec"

inherit rpm
