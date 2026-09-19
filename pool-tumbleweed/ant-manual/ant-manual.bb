SUMMARY = "Manual for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains the manual for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-manual-1.10.18-1.1.noarch.rpm"
RPM_HASH = "14bb53667cdec3ead758d4fc64f501fdd40b689447f479041a08244c81af218da6bbad1af2d16e1d6b0cc41b264a68e6db4bda30cd3ab1d680ff06cc11b9152f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-manual"

RDEPENDS:${PN} += ""

inherit rpm
