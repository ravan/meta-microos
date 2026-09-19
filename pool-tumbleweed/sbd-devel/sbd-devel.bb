SUMMARY = "Storage-based death environment for regression tests"
DESCRIPTION = "This package provides an environment + testscripts for \
regression-testing sbd."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2+20260320.2c43532"

RPM_NAME = "sbd-devel-1.5.2+20260320.2c43532-2.3.aarch64.rpm"
RPM_HASH = "9b376d47c9046e824b9249907d820e74cefa9c641034cc86ee3d5f95baf5fc82c07dcc3d3604b3aef634850cfc65d52aa93584a745b1f82103bd12a146b10ba2"

RPROVIDES:${PN} += "libsbdtestbed.so.0 \
sbd-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
libc.so.6 \
libglib-2.0.so.0 \
sbd"

inherit rpm
