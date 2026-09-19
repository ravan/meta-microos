SUMMARY = "Common library"
DESCRIPTION = "Collection of classes used by Object Refinery Projects, for example \
jfreechart"
LICENSE = "LGPL-2.1-only"

PV = "1.0.24"

RPM_NAME = "jcommon-javadoc-1.0.24-3.8.noarch.rpm"
RPM_HASH = "dc31637d333b8fd55d51d4b556a32255340fbf8c75d4c030335e0e001b09682dd10e9edd3c28d7315849ae7e855a2c92767139c0928e2bf7f1827ee7bcd6ecf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcommon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
