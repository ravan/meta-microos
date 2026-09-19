SUMMARY = "API documentation for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the API documentation for GTK+ 3.x."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-devel-doc-3.24.52+git59.b30343717d-1.1.noarch.rpm"
RPM_HASH = "342f199d4c54b0cab820c6d752ef6ebdf590c6dca90e7484ab5df00184898898bc962e18c1aa227d67d2f62db7951640cfb833e673430660af0a44feabd1c451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
