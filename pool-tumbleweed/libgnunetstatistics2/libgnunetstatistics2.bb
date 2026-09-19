SUMMARY = "GNUnet library libgnunetstatistics"
DESCRIPTION = "This package contains the libgnunetstatistics library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetstatistics2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "b582a0f0bc6bb6e12236ae6a6492970883cca311163cb00ac7cbe2721a1e0e719aae020176443864263707a093967c3ae557fe5127677f983441b6a043c3b242"

RPROVIDES:${PN} += "libgnunetstatistics.so.2 \
libgnunetstatistics2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
