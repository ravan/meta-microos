SUMMARY = "A class library for high energy physics"
DESCRIPTION = "CLHEP is intended to be a set of high energy physics specific \
foundation and utility classes such as random generators, physics \
vectors, geometry and linear algebra. CLHEP is structured in a set of \
packages independent of any external package (interdependencies within \
CLHEP are allowed under certain conditions). \
 \
This package provides the header files and libraries for development \
of applications using CLHEP."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "230d8835c29c91aac5aeca082acb7291f6d6f870bfbfb8f3fb465e02fcbc5ccfa7f09a350518055784346e24a1def60c5e202d5b31def56d35767b0e66c12000"

RPROVIDES:${PN} += "clhep-devel \
pkgconfig-clhep"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
clhep-Units-devel \
clhep-Utility-devel \
libCLHEP-2-4-7-2 \
pkgconfig-clhep-cast \
pkgconfig-clhep-evaluator \
pkgconfig-clhep-exceptions \
pkgconfig-clhep-genericfunctions \
pkgconfig-clhep-geometry \
pkgconfig-clhep-matrix \
pkgconfig-clhep-random \
pkgconfig-clhep-randomobjects \
pkgconfig-clhep-refcount \
pkgconfig-clhep-vector"

inherit rpm
