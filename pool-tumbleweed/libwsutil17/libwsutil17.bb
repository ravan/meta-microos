SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.6.8"

RPM_NAME = "libwsutil17-4.6.8-2.1.aarch64.rpm"
RPM_HASH = "465981107a9f437e42367e3711bf7d382b5f8248418ce12367cc4fc47200964337dbef9c12cded4c8979a057ff0f5a6e3cc9cf4173d89db8da27670a6dbbbe4e"

RPROVIDES:${PN} += "libwsutil.so.17 \
libwsutil17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libpcre2-8.so.0 \
libz.so.1"

inherit rpm
