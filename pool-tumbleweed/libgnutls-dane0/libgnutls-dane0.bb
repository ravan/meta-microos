SUMMARY = "DANE support for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS project aims to develop a library that provides a secure \
layer over a reliable transport layer. \
This package contains the 'DANE' part of gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutls-dane0-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "e369e9c159a857f5c50368b8d371ed3a0e29b983bbc16df64db6aed5d31e157485a9a9563b865376be445bdc60a10fbf32aa9b2a76437e01713b610e3548fdfb"

RPROVIDES:${PN} += "libgnutls-dane.so.0 \
libgnutls-dane0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libunbound.so.8"

inherit rpm
