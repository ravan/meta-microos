SUMMARY = "Development files for giac"
DESCRIPTION = "This package contains header files and libraries needed to develop \
application that use the GIAC computer algebra system."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "giac-devel-2.0.0-2.6.aarch64.rpm"
RPM_HASH = "b69bd058108224676ac7ff2f376758ce5ac8f3e40d56f2a73048499f6c703d6adbd847f42ce8a11d6ae97455e3cbd4c53bcbabe88cc5a5982756053290039d87"

RPROVIDES:${PN} += "giac-devel"

RDEPENDS:${PN} += "fltk-devel \
libgiac0 \
mpfi-devel \
pkgconfig-gsl \
pkgconfig-mpfr \
pkgconfig-ntl"

inherit rpm
