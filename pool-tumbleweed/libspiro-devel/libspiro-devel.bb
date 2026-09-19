SUMMARY = "Development Files for libspiro"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libspiro."
LICENSE = "GPL-3.0-or-later"

PV = "20240903"

RPM_NAME = "libspiro-devel-20240903-1.5.aarch64.rpm"
RPM_HASH = "685bfb431c7e98b56aaa62edcf2ed265db31fe631cd25a319f90b75c32ff85c776469866a43097d0a731f4b9345e42da5ec5a9010823cefb9d0f3e3b2eaf4978"

RPROVIDES:${PN} += "libspiro-devel \
pkgconfig-libspiro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libspiro1"

inherit rpm
