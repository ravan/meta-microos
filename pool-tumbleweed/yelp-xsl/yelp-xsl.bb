SUMMARY = "XSL stylesheets for the yelp help browser"
DESCRIPTION = "This package contains XSL stylesheets that are used by the yelp help browser."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "49.0"

RPM_NAME = "yelp-xsl-49.0-1.4.noarch.rpm"
RPM_HASH = "8b104ea5889207078b1d5329bcdbddb3e61fbb03af928e1c873768fe1029552d1b6abb46db2b23e4b175b30a5fb07b1f65a5557f5b17952a8606de2e4b5be532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-yelp-xsl \
yelp-xsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
