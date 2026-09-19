SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virtctl-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "09a1aa1d3eb75a62e46099d85d0c1c1c4ed1acbe24615eb3137363d5cc00833ad84cad1bb097b3c21c27e4e87c9b4ec1c1567013761f068ea45a692dc22e3876"

RPROVIDES:${PN} += "kubevirt-1.8-virtctl \
kubevirt-virtctl \
kubevirt1.8-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
