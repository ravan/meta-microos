SUMMARY = "XMvn Core"
DESCRIPTION = "This package provides XMvn Core module, which implements the essential \
functionality of XMvn such as resolution of artifacts from system \
repository."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-core-4.3.0-8.1.noarch.rpm"
RPM_HASH = "1ce34d14178b6ce00f580087e8200c87a73ac70035bc7270a5c9541871e1866135fe1a67d1d8689a9581259eb4a60f75e92477b32779e4c081d90d01f132f6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.fedoraproject.xmvn-xmvn-core-pom- \
xmvn-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
