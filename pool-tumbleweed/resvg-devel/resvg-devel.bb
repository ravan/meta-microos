SUMMARY = "SVG rendering library (C++/Qt API)"
DESCRIPTION = "An SVG rendering library (C++/Qt API). \
This package contains development files for resvg."
LICENSE = "Apache-2.0 | MIT"

PV = "0.48.1"

RPM_NAME = "resvg-devel-0.48.1-1.2.aarch64.rpm"
RPM_HASH = "093f5ee6ae9b3d9c8546aaae9e077c210367881409be72f05776fa7695a2efc3094c267a071f89a6f731ec50978240dbe480ae020f5d7464e13f62a826cfc20c"

RPROVIDES:${PN} += "pkgconfig-resvg \
resvg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libresvg0-48"

inherit rpm
