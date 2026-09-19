SUMMARY = "Development files for the base X bitmaps"
DESCRIPTION = "This package contains the base X bitmaps, which are used in many \
legacy X clients."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xbitmaps-devel-1.1.4-1.2.noarch.rpm"
RPM_HASH = "06df9e9d7df730aa25aa314a1d3e2345ed7e675db9542ef5ec885273440eb50b6897c32249a622633801966debdbe472a1441ff1d7e14fe318992e0a96e40555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xbitmaps \
xbitmaps-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
