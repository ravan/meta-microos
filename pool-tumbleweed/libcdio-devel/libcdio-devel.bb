SUMMARY = "CD-ROM access library"
DESCRIPTION = "The libcdio package contains libraries for CD-ROM and CD image \
access. Applications can use them as an abstraction to OS- and \
device-dependent properties of a CD-ROM or of the specific details of \
various CD image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the cdio libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libcdio-devel-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "8b10c1d15db56004d37c5f2c67c1ec9b9faf56303d2083bdaf7c159299d3eb2aa37ab875aa6fe58af379733d11950b569fab0f9e1fef7643b89ee810f94a0494"

RPROVIDES:${PN} += "libcdio-devel \
pkgconfig-libcdio \
pkgconfig-libcdio++ \
pkgconfig-libiso9660 \
pkgconfig-libiso9660++ \
pkgconfig-libudf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcdio++1 \
libcdio19 \
libiso9660++1 \
libiso9660-12 \
libudf0 \
pkgconfig-libcdio"

inherit rpm
