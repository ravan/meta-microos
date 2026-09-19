SUMMARY = "Headers and sources for development with CLHEP Vector library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Vector library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Vector-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "cc5c8ec670119f9bc0d170dfd17433c316b475f6a6be31ae017129a3d131c18cd56e83cc7dfba58a6ce9032c8bba0db039514e50e932e6a1f2c83dec67bee127"

RPROVIDES:${PN} += "clhep-Vector-devel \
pkgconfig-clhep-vector"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
clhep-Units-devel \
libCLHEP-Vector-2-4-7-2"

inherit rpm
