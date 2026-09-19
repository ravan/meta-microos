SUMMARY = "Development files for xdigest"
DESCRIPTION = "Xdigest is a digest algorithm implementation library designed for speed. It \
uses assembly optimization for performance, is designed to be small and \
lightweight and provides a simple API. \
 \
This package contains the files needed to develop and build using xdigest."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "xdigest-devel-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "34911e10cfef586d94764866ce8543dd3f65a739795e22a9016689af737cb092216d7a710f4863fd33691bbf9157ac2fe6a9b2c8eb65f3d11931e42df8428844"

RPROVIDES:${PN} += "cmake-xdigest \
pkgconfig-xdigest \
xdigest-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxdigest0"

inherit rpm
