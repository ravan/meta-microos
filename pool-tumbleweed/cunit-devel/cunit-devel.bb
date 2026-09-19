SUMMARY = "CUnit development files"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit development files."
LICENSE = "LGPL-2.0-only"

PV = "2.1.3"

RPM_NAME = "cunit-devel-2.1.3-7.10.aarch64.rpm"
RPM_HASH = "f30b1676a411eb986219ccb964db5faa752781a24e840351e8617e8cfdfbddf145d620308d503b33055caf65dcb73e5683e9b2c77afdef1c031bc4b97bd5db2e"

RPROVIDES:${PN} += "cunit-devel \
pkgconfig-cunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcunit.so.1 \
libcunit1 \
ncurses-devel \
pkgconfig"

inherit rpm
