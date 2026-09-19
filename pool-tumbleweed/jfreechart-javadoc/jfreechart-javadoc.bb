SUMMARY = "Javadocs for jfreechart"
DESCRIPTION = "This package contains the API documentation for jfreechart."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.5"

RPM_NAME = "jfreechart-javadoc-1.5.5-1.4.noarch.rpm"
RPM_HASH = "b13b657b78457a905433692430bcd0ad600179cde01cfc56b40cfa3e2189153202d5dbd64e2f1333e29e16fc9d51ae68dc47efae792355703e53e2a4dff040bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jfreechart \
jpackage-utils"

inherit rpm
