SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-controller-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "732ed1fac9a4cdc313db8404652b72ff7f61e753e440ab360aa1f4b1ea71d1d9cf795da1cf6a18ea0e252a77f491ee39eeb2f495fbc51c6afa14c2aae426c9b8"

RPROVIDES:${PN} += "kubevirt-1.8-virt-controller \
kubevirt-virt-controller \
kubevirt1.8-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
