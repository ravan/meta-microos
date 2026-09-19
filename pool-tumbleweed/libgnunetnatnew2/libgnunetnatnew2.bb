SUMMARY = "GNUnet library libgnunetnatnew"
DESCRIPTION = "This package contains the libgnunetnatnew library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetnatnew2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "825458a3780924419f7cc4ceba013203e9a7ea503595d78d35db1cc38a9695bebdf4b6f2b9702aba0ce558671cfc8cfb1f8a6e58b39cfa24347f9afecd201498"

RPROVIDES:${PN} += "libgnunetnatnew.so.2 \
libgnunetnatnew2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
