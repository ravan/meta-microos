SUMMARY = "Emoji annotation files in CLDR"
DESCRIPTION = "This package contains the pkg-config files for development when building \
programs that use cldr-annotations."
LICENSE = "LGPL-2.0-or-later & Unicode"

PV = "36.12.120191002_0"

RPM_NAME = "cldr-emoji-annotation-36.12.120191002_0-1.18.noarch.rpm"
RPM_HASH = "b3e49b9286a628d29ce658eb6b67af74f05a3b85fc13666fe68d72e65b6c0345bdf7bfe75598601b94010c0cf7490b792dbce58601803171222fbc4fa474c64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cldr-emoji-annotation"

RDEPENDS:${PN} += ""

inherit rpm
