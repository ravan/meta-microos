SUMMARY = "Qualcomm IPC Router shared library"
DESCRIPTION = "Userspace reference for net/qrtr in the Linux kernel"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "qrtr-1.0-1.10.aarch64.rpm"
RPM_HASH = "af2aa15141ad9852a326681fdd6d8368829c8088056f7cb725087d4314309f199fc390e28838d0bfe417cce8d1ce732cb38e5d6fcb872713d1da17696b944a01"

RPROVIDES:${PN} += "qrtr"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
