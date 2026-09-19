SUMMARY = "Development files for libopenjph, a JPEG-2000 Part 15 library"
DESCRIPTION = "This package contains libopenjph, a library implementing the JPEG-2000 \
standard Part 15."
LICENSE = "BSD-2-Clause"

PV = "0.31.0"

RPM_NAME = "openjph-devel-0.31.0-1.1.aarch64.rpm"
RPM_HASH = "ed955ff9f8fe6fa54a4cf1667616e0e06e6834d0bd2baf7a789472b32d68b424bf54d4dde718a96d714d0e86a708bbbda87d629ed856e6ba01e1718256694d31"

RPROVIDES:${PN} += "cmake-openjph \
openjph-devel \
pkgconfig-openjph"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg-devel \
libopenjph0-31"

inherit rpm
