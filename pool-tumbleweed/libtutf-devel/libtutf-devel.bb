SUMMARY = "Unicode/Charset conversion library for twin"
DESCRIPTION = "Unicode <-> charset conversion routines for twin."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+161"

RPM_NAME = "libtutf-devel-0.9.0+161-1.5.aarch64.rpm"
RPM_HASH = "d99de7aa4e9bac576c4cfe41c27eec981b63f64e5e224366f2087443044739f65986c30726366348743655cc282c726972eaab4b705a99b761a601dcbb445a42"

RPROVIDES:${PN} += "libTutf-devel \
libtutf-devel"

RDEPENDS:${PN} += "libtutf1"

inherit rpm
