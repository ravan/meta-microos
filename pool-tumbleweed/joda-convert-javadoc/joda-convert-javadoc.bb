SUMMARY = "API documentation for joda-convert"
DESCRIPTION = "This package contains the API documentation for joda-convert."
LICENSE = "Apache-2.0"

PV = "2.2.3"

RPM_NAME = "joda-convert-javadoc-2.2.3-2.8.noarch.rpm"
RPM_HASH = "e52aa35ec55f80693c849780a82ac5fe488ea9f25f4174b7f015f093f4126dea7f8dd989ee7e54c4a59abc8960dfa865fa60a250320f1ed253c75433fec7f4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-convert-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
