SUMMARY = "Javadoc for maven-shared-utils"
DESCRIPTION = "API documentation for maven-shared-utils."
LICENSE = "Apache-2.0"

PV = "3.4.2"

RPM_NAME = "maven-shared-utils-javadoc-3.4.2-1.10.noarch.rpm"
RPM_HASH = "0be57cd9eb64ab8ea5e07609a0c819ea5d8d2903e4af060d78826eebb286842a891d84892fb56393f75d1ff6f8bd097318bfeec8769d3a0dd96c2698765d3cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-utils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
