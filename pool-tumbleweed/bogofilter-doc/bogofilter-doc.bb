SUMMARY = "Bogofilter documentation"
DESCRIPTION = "This package contains the documentation of bogofilter"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "bogofilter-doc-1.2.5-1.1.noarch.rpm"
RPM_HASH = "0c669fbbf9bb29effccea7db68c310e409776a47fc4a92dec8be26bc4832d130ddd78446de6ac67e51c1c506238184e33453591c308d976b02c5a18763d8cb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bogofilter-doc"

RDEPENDS:${PN} += ""

inherit rpm
