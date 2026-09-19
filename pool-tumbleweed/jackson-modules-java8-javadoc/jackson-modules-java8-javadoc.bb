SUMMARY = "API documentation for jackson-modules-java8"
DESCRIPTION = "API documentation for jackson-modules-java8."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-modules-java8-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "71caa3399033505021eeb26580abde9c765e2ed39f4d318318caef505d0925ba121d3b6ead442f685fdca31653220c392c1d610bb18e9619677a629510cdb723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-java8-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
