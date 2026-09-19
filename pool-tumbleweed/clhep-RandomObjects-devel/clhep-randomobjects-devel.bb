SUMMARY = "Headers and sources for development with CLHEP RandomObjects library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP RandomObjects library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-RandomObjects-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "602100b895caa77df064a35305b2d182ab8e67624859e599bafdf1699090f8c0232565138e1a73fce189109d1fe15abdf06ea603b3ca2dcbecce33e0c411f894"

RPROVIDES:${PN} += "clhep-RandomObjects-devel \
pkgconfig-clhep-randomobjects"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
clhep-Units-devel \
clhep-Utility-devel \
libCLHEP-RandomObjects-2-4-7-2 \
pkgconfig-clhep-matrix \
pkgconfig-clhep-random \
pkgconfig-clhep-vector"

inherit rpm
