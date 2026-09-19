SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-handler-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "c051b6bbafd73590b7f0ce0761f9f4a09b705c4d0836db7d5a78b52287441fd0ccb2e7ee98ea672d8878de30ce3403d81d2a73fe8210e26836588f619dd93ec1"

RPROVIDES:${PN} += "kubevirt-virt-handler \
kubevirt1.9-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
