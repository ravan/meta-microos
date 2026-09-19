SUMMARY = "Common data files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains common data that is used by the cheese libraries, \
like schemas."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+12"

RPM_NAME = "libcheese-common-44.1+12-1.6.noarch.rpm"
RPM_HASH = "32b40689f163127acbd8aa9492cd6f88ab0d14808b11d4e95b402ae067ecf4faa3343733e6e12e5acc24d607784c5251440de2e8a7bcc4f4f7a7e4d94436a158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcheese-common"

RDEPENDS:${PN} += ""

inherit rpm
