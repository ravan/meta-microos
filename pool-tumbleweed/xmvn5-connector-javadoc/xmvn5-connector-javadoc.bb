SUMMARY = "API documentation for xmvn5-connector"
DESCRIPTION = "This package provides API documentation for xmvn5-connector."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-connector-javadoc-5.1.0-3.1.noarch.rpm"
RPM_HASH = "52b8bbcb17ee8ff4b40671b40747e5e56362dcdd2ca0297f72f74b8c5f8db3153ccac3f953ecd3f33b0675f889f4010b84f15d9a32d26f153fe67178aed1036e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn5-connector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
