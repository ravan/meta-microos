SUMMARY = "PDF Documentation for dvdisaster"
DESCRIPTION = "Documentation package for using dvdisaster in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.10"

RPM_NAME = "dvdisaster-docs-0.79.10-3.4.noarch.rpm"
RPM_HASH = "236a9ff80c6e2489629d8da4d17466fc6bd75e36073bb76d5e732706b61fbd905c2d2590b90c848e03fbbca06b8a88bd180caac43ed74cf772ec11900635deac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dvdisaster-docs"

RDEPENDS:${PN} += ""

inherit rpm
