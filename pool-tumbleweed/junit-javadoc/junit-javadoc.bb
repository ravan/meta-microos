SUMMARY = "Javadoc for junit"
DESCRIPTION = "Javadoc for junit."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-javadoc-4.13.2-8.9.noarch.rpm"
RPM_HASH = "7af18c4e4e8b6418c7912c63646d5c71a922e4e9f43365fce05710ca9004f133c28aed2d8994ab5e9e369f63a1f8f8e0b142b7400fd034dc61791c29c5339f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit-javadoc \
junit4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
