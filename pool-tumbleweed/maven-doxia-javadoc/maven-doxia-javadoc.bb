SUMMARY = "Javadoc for maven-doxia"
DESCRIPTION = "API documentation for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-javadoc-2.1.0-1.3.noarch.rpm"
RPM_HASH = "4f670dede4e2856c43dc6855a2567203a45378be5af3fcffff710d70fe59bcb8344d3438cdabe378c4a07b165966ff3eba42136ec8f6c08de552fccc68309c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
