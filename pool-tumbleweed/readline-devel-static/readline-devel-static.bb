SUMMARY = "Static library for development with readline"
DESCRIPTION = "This package contains the static library for the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "readline-devel-static-8.3.3-2.6.aarch64.rpm"
RPM_HASH = "417f67bba8fd5b16a0ebbe7e31187df4b1f05111db5a02f94b963c2ff04389975f1c13d0418fe26074656cf2af79f919aa59ac317a59bfbda3e47a0c1864d6f3"

RPROVIDES:${PN} += "readline-devel-static"

RDEPENDS:${PN} += "ncurses-devel \
readline-devel"

inherit rpm
