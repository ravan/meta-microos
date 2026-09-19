SUMMARY = "GNUnet library libgnunetblock"
DESCRIPTION = "This package contains the libgnunetblock library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetblock0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "f4dbb6c8102dbb71aa7db055c7ec72bd4dde5c40cc5580a1a78914462dcb53db0ea07c81fac585c02152a44cb5b42117fb24ce1ee677f9a1c4d60dbf7bf5d572"

RPROVIDES:${PN} += "libgnunetblock.so.0 \
libgnunetblock0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
