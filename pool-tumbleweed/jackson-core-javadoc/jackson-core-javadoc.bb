SUMMARY = "Javadoc for jackson-core"
DESCRIPTION = "This package contains API documentation for jackson-core."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-core-javadoc-2.18.9-2.1.noarch.rpm"
RPM_HASH = "7ab370e932467f43cd16647051630311cdd0676442f6ba34aeac777208122faf9f281cdc4318d087611cc57b19f78328ce0434f7cc1e83af6cd34958f627ce5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
