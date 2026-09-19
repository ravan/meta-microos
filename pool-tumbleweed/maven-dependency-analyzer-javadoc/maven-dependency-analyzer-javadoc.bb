SUMMARY = "API documentation for maven-dependency-analyzer"
DESCRIPTION = "API documentation for maven-dependency-analyzer"
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "maven-dependency-analyzer-javadoc-1.17.1-1.2.noarch.rpm"
RPM_HASH = "35e6e415a7a9bb8511f233ce6853792b8df15d0ef3230f838adf2cbf46f22a0c97bc29bcb97ce2f2c1753ad1a82ba7c3a4833703f66fe664931a42fe0ed54144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
