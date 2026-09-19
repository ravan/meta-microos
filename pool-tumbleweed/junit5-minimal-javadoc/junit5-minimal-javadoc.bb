SUMMARY = "Javadoc for junit5-minimal"
DESCRIPTION = "Junit5 API documentation."
LICENSE = "EPL-2.0"

PV = "5.14.4"

RPM_NAME = "junit5-minimal-javadoc-5.14.4-2.3.noarch.rpm"
RPM_HASH = "5d4d31f7a30ab81948f258e845fcc122f92219a0604090eb9d356a76c18ab7869a1cfb9c3a780e666fa73061dd3c379c39aecb69ecb2518632a049131d7e80d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-minimal-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
