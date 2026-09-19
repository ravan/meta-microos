SUMMARY = "GNUnet library libgnunetseti"
DESCRIPTION = "This package contains the libgnunetseti library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetseti0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "d0e9fcb8281aa8fd5d802ed11dabd4aa23cabeba019c1742990fdf55e63d8efcd431b49d112433e54cadc5a9161e7f27bcc9611e0f025f7803a3730291a41cbf"

RPROVIDES:${PN} += "libgnunetseti.so.0 \
libgnunetseti0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
