SUMMARY = "Javadoc for maven-doxia-sitetools"
DESCRIPTION = "API documentation for maven-doxia-sitetools."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-sitetools-javadoc-2.1.0-2.1.noarch.rpm"
RPM_HASH = "69f5da7d57bc4f4d26f9433eeab6d7684b952b437b3be888f82d03ce8fafcac093dd67486d5d7efd37c29e88ad3d228fc87d3d3e36c1dde6a65333e255430a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sitetools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
