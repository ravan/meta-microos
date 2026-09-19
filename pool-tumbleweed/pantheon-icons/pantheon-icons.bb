SUMMARY = "A Tango-styled icon theme"
DESCRIPTION = "An original set of vector icons designed specifically for Pantheon."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "pantheon-icons-8.2.0-1.3.noarch.rpm"
RPM_HASH = "6564588613ce738dbb49cbe76282be333b7c22083ae2692cbe4741463793b08339040138b658bb256a3d3db917b62a24eeecaee95a5906d71933672dc956d4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-icon-theme \
pantheon-icons"

RDEPENDS:${PN} += ""

inherit rpm
