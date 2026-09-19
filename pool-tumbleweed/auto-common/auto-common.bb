SUMMARY = "Auto Common Utilities"
DESCRIPTION = "Common utilities for creating annotation processors."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-common-1.6.1-3.4.noarch.rpm"
RPM_HASH = "7d3fd3d2947351260475e4ff2f6810a1bfb9b72c7cde2eef18bcce71c7376138da5e4ff4b21d7b4a8216ff74a6f782fe84e5fe2af66bdb894b3fb27542683210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-common \
mvn-com.google.auto-auto-common \
mvn-com.google.auto-auto-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava"

inherit rpm
