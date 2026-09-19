SUMMARY = "GNUnet library libgnunetmhd"
DESCRIPTION = "This package contains the libgnunetmhd library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetmhd0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "621615c70dfdc58939c2686fcde97496a2a499fc346e576facb35c53780f760be77d2d5fd5907c448ab5aa464b389cbd7f022e10f49673445a4020f20a5c5317"

RPROVIDES:${PN} += "libgnunetmhd.so.0 \
libgnunetmhd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20 \
libjansson.so.4 \
libmicrohttpd.so.12 \
libz.so.1"

inherit rpm
