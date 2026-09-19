SUMMARY = "Headers for Industrial I/O library -- development files"
DESCRIPTION = "Modified version of libshout \
 \
This sub-package contains the development files."
LICENSE = "LGPL-2.0-only"

PV = "2.4.6.r2"

RPM_NAME = "libshout-idjc-devel-2.4.6.r2-1.4.aarch64.rpm"
RPM_HASH = "cb020c2c4bce3208ff85d50e920ddc9dfdeb7ba9376a693ddde85650848854a3396263eef04c0d70977718c428a5647b45724ea6a3c4ec3588f541e2cd5ec5db"

RPROVIDES:${PN} += "libshout-idjc-devel \
pkgconfig-shout-idjc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshout-idjc \
pkgconfig-libssl \
pkgconfig-ogg \
pkgconfig-speex \
pkgconfig-theora \
pkgconfig-vorbis"

inherit rpm
