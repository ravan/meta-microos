SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virtctl-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "c0e892113e01b5d932ec238ebcb070a7b74d3f5732166b42ac389e8cdd99d870356bf4ec5bb402c9ae51f8a572ed8c07d27f2de0256720b3b1b037693cee2194"

RPROVIDES:${PN} += "kubevirt-virtctl \
kubevirt1.9-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
