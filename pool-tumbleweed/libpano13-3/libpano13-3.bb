SUMMARY = "Panorama Tools Back-End Library"
DESCRIPTION = "Library and utilities for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.23"

RPM_NAME = "libpano13-3-2.9.23-1.4.aarch64.rpm"
RPM_HASH = "b48df5f4ea01b9e795c2d47a2a3710ffe0aea9fa58f8a89a9427ab8a3b0b8d92f6d9b5cb85272c91d833ae75090af06ab77c67b1760538b4c06c8cef359138f5"

RPROVIDES:${PN} += "libpano13-3 \
libpano13.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
