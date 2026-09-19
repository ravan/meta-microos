SUMMARY = "Config schema for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-schema-3.24.52+git59.b30343717d-1.1.noarch.rpm"
RPM_HASH = "acb206ff95581e939611aa57dc9c9add96dac5bda6af87ff87d7d34f36f3af33347570ea77c4f44efd9a09fc1426188281fb842d09e15ecef52722bdd3342e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-schema"

RDEPENDS:${PN} += ""

inherit rpm
