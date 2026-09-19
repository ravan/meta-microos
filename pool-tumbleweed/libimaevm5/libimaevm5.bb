SUMMARY = "IMA/EVM control utility libary"
DESCRIPTION = "This package provides the shared library for IMA/EVM (Integrity \
Measurement Architecture/Extended Verification Module)."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later-with-Linux-syscall-note & LicenseRef-GPL-2.0-with-openssl-exception"

PV = "1.6.2"

RPM_NAME = "libimaevm5-1.6.2-1.9.aarch64.rpm"
RPM_HASH = "61430cee0a265542119de7c163657c029ae30a03ac1522862227aa1afbe13b56c96f52220dec0ae848c1a0666d2bd32b0cb874324ff02da5c6f3864ccc357e76"

RPROVIDES:${PN} += "libimaevm.so.5 \
libimaevm5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
