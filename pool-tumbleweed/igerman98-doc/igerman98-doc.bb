SUMMARY = "Documentation for German dictionaries"
DESCRIPTION = "Documentation for German, Swiss, and Austrian dictionaries for the ispell \
and myspell spell checkers."
LICENSE = "GPL-2.0-or-later"

PV = "20161207"

RPM_NAME = "igerman98-doc-20161207-6.1.noarch.rpm"
RPM_HASH = "e4f17687c5ecf93fd56e2a3db83b133e62529bc26a5585f971e30c7e0bd8cb45e6d7273348844aa9697e040204bb97f6a1c0201bf385a2b4b04042f0391e6132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "igerman98-doc"

RDEPENDS:${PN} += ""

inherit rpm
