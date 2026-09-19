SUMMARY = "GNUnet library libgnunetsq"
DESCRIPTION = "This package contains the libgnunetsq library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetsq0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "5c3b5c9ff9fb4f98b29b21553fafcfecf91edebd357285c1bd82ced20adf81cb5bdf2a799b1d62d15da4d2d8c9a12ffcea6e654be6c70a1204dbf6417d281f12"

RPROVIDES:${PN} += "libgnunetsq.so.0 \
libgnunetsq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20 \
libsqlite3.so.0"

inherit rpm
