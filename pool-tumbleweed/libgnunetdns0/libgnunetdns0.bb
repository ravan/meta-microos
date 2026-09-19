SUMMARY = "GNUnet library libgnunetdns"
DESCRIPTION = "This package contains the libgnunetdns library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetdns0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "3eb98077de1a0da6c5f5f687604965fe10b9231e237340b43400ae9a165b3bf626276f48cfa264af0062e7235799345732c7176de1107a17525638a758fc8442"

RPROVIDES:${PN} += "libgnunetdns.so.0 \
libgnunetdns0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
