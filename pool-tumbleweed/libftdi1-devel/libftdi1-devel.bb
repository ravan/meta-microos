SUMMARY = "Header files for libftdi1"
DESCRIPTION = "Header files and static libraries for libftdi. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1-only & GPL-2.0-only & GPL-2.0-with-classpath-exception"

PV = "1.6rc1.2+git.92d657b"

RPM_NAME = "libftdi1-devel-1.6rc1.2+git.92d657b-2.1.aarch64.rpm"
RPM_HASH = "d997777fe63cf8c16fcf78b38a2629abf1faff1cedd7503cad3e205035f7e4f26bf8f890c2aedba93354367d847e78e2fe3a825e380d380c9b13c058f2b4d861"

RPROVIDES:${PN} += "cmake-LibFTDI1 \
libftdi1-devel \
pkgconfig-libftdi1 \
pkgconfig-libftdipp1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libftdi1-2 \
libftdi1.so.2 \
libusb-1.0.so.0 \
pkgconfig-libftdi1 \
pkgconfig-libusb-1.0"

inherit rpm
