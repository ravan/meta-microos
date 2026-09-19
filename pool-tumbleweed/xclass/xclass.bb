SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "xclass-0.9.2-189.10.aarch64.rpm"
RPM_HASH = "734f338a45493b0d8c85a76e7936f4e04868eed940d11d97b7aeec78a987f2b027501d0611b285f50ec75064db6832ff42d4e3ee4db0a27eada9ec94c2a5386b"

RPROVIDES:${PN} += "config-xclass \
xclass"

RDEPENDS:${PN} += ""

inherit rpm
