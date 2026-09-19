SUMMARY = "Some utilities for libiscsi"
DESCRIPTION = "libiscsi is a clientside library to implement the iSCSI protocol that can \
be used to access resource of an iSCSI target. \
 \
This package contains utilities based on libiscsi."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.3"

RPM_NAME = "libiscsi-utils-1.20.3-1.3.aarch64.rpm"
RPM_HASH = "3ec4b0ff42ec37be859fea76dd1ed9e0d3f6e41f0b1a31b469840028a3bef4ea0789f5092a04613474dbf88d10f30b596e6e3136971e57a7434517519fc87ad5"

RPROVIDES:${PN} += "libiscsi-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.11"

inherit rpm
