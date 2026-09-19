SUMMARY = "GNUnet library libgnunetpils"
DESCRIPTION = "This package contains the libgnunetpils library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetpils0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "e3d2d1cdc9c21b4a6abb39b1c6f8b9fab92f1717a4583c2f66dded55f143b3e501e46530e08bbdae9c8cc3eb4a54204239b0829a97853a890b6638984f546da7"

RPROVIDES:${PN} += "libgnunetpils.so.0 \
libgnunetpils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunethello.so.0 \
libgnunetutil.so.20"

inherit rpm
