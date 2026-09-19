SUMMARY = "Javadoc for httpcomponents-asyncclient"
DESCRIPTION = "This package contains javadoc for httpcomponents-asyncclient."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-javadoc-4.1.4-5.4.noarch.rpm"
RPM_HASH = "a0c20572bd01a42d8a923f00e7fb97445ef4598a27317aab8f0ce59bc51251fe9c4ac3ea0ade19e8f4df092147dc425777b9010d7dcd34b817291906e047a3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
