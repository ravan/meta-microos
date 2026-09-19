SUMMARY = "Development files for the Osmocom transcoding library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocoding-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "ef21050a28e28bf6cf8ef68d48a9d657a22fcb83aaf5e93d7286cb1df1ca1d9fbeb72a40edeac1d58e32bdca9454b77f3b260f6c6d7336dca0a94dbc6ea8461a"

RPROVIDES:${PN} += "libosmocoding-devel \
pkgconfig-libosmocoding"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocoding0 \
libosmocore-devel \
pkgconfig-libosmocodec \
pkgconfig-libosmocore \
pkgconfig-libosmogsm \
pkgconfig-talloc"

inherit rpm
