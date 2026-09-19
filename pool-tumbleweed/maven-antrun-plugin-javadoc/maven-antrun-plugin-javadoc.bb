SUMMARY = "Javadoc for maven-antrun-plugin"
DESCRIPTION = "This package contains the API documentation for maven-antrun-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-antrun-plugin-javadoc-3.2.0-1.5.noarch.rpm"
RPM_HASH = "e4b5c278293f03a0fd43118a4c3f706e05d0f97982a673da6a42d689cac05a39904cc7426fe355bc8e45d70a380a8cd219cc62f0a28a1ac4600f215718418e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-antrun-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
