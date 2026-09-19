SUMMARY = "Javadoc for maven-file-management"
DESCRIPTION = "API documentation for maven-file-management."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-file-management-javadoc-3.2.0-1.6.noarch.rpm"
RPM_HASH = "10c867840e45bf65890d8ded62a38c83d2348233f4a332e2863ab3b988c6b23377118fc2e23cd744d4dea8f6a1bf9b715d8fd017f987df90214287165c33880e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
