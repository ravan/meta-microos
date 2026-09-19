SUMMARY = "Javadoc for maven-jmod-plugin"
DESCRIPTION = "API documentation for maven-jmod-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jmod-plugin-javadoc-3.0.0-1.4.noarch.rpm"
RPM_HASH = "16d03944cd003c581d266d1efd879ce4ebd009b9af67aed20852bbd5a1b68ec717450506176ebaa5c5dd74ced237c1df29693e9bb70ee8cd6030a81b5a11b1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jmod-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
