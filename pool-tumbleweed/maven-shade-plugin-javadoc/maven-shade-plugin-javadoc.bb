SUMMARY = "API documentation for maven-shade-plugin"
DESCRIPTION = "API documentation for maven-shade-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.2"

RPM_NAME = "maven-shade-plugin-javadoc-3.6.2-1.2.noarch.rpm"
RPM_HASH = "f1e4d5e498366a894536112e639a7a26345c41571135afa3bceab269e526bc20deec6cde25b43cc5ac006560f6bfd98aeb0417424bf42bb86f327f06c044a5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shade-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
