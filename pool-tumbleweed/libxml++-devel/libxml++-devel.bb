SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "5.2.1"

RPM_NAME = "libxml++-devel-5.2.1-3.6.aarch64.rpm"
RPM_HASH = "da9ff555c6a4b73ae5552eab126ce31ec066da92622dc018fcd2485ece7b018a00b5d2d32df0106c96717d947a0be84d1564c219552c97dc9094383fa60ede95"

RPROVIDES:${PN} += "libxml++-devel \
pkgconfig-libxml++-5.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-5-0-1 \
pkgconfig-libxml-2.0"

inherit rpm
