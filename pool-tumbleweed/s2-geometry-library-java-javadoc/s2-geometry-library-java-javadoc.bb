SUMMARY = "API documentation for s2-geometry-library-java"
DESCRIPTION = "API documentation for s2-geometry-library-java."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "s2-geometry-library-java-javadoc-2.0.0-3.4.noarch.rpm"
RPM_HASH = "8263c4f03a4457baacf3ca85f5c2ab4681df1a13c831d8be8babb8a78e299383239e2214fecce0773bb7359508a8103b8f7571a763d8a9018163099c2a28291e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "s2-geometry-library-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
