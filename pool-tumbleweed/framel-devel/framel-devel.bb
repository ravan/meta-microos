SUMMARY = "Headers and sources for developing with the gravitational wave frame library"
DESCRIPTION = "The Frame Library is a software dedicated to frame data manipulation including \
file input/output. \
 \
This package property the headers and sources needed to develop applications \
against the frame library."
LICENSE = "LGPL-2.1-or-later"

PV = "8.48.4"

RPM_NAME = "framel-devel-8.48.4-2.7.aarch64.rpm"
RPM_HASH = "55fb5ae9441b5ef5fbd21e78ebcdcbabbbb0dc3f692b07434ec7781e5e4c2b0f7cb630f34da1667084e58d14609455b8de316fa818d5f5038dd81fd30b4db3ec"

RPROVIDES:${PN} += "framel-devel \
pkgconfig-framel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libframel8"

inherit rpm
