SUMMARY = "Documentation for texlive-aiplans"
DESCRIPTION = "This package includes the documentation for texlive-aiplans"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn74462"

RPM_NAME = "texlive-aiplans-doc-2026.226.3.0svn74462-61.2.noarch.rpm"
RPM_HASH = "24c3c9f90645f93f9863336d7ad351a7c062731858b77dd1bab46ee0ab816707fe606533c84f3a6a7f95a721fa26f66478c183642dfde40ccdfb61b26008e37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aiplans-doc"

RDEPENDS:${PN} += ""

inherit rpm
