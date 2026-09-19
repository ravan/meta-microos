SUMMARY = "Javadoc for jakarta-activation"
DESCRIPTION = "This package contains javadoc for jakarta-activation."
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "jakarta-activation-javadoc-2.1.3-1.9.noarch.rpm"
RPM_HASH = "b4fb5053d44eb446ae4a89319caf7bdf221b780709d5250372a239535b4b2eb21adc6d4cc31143daf61a64934c75255714e2f4e75e566cd707f4deb590e05cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-activation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
