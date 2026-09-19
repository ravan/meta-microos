SUMMARY = "Documentation for texlive-acmart"
DESCRIPTION = "This package includes the documentation for texlive-acmart"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn76177"

RPM_NAME = "texlive-acmart-doc-2026.226.2.16svn76177-61.2.noarch.rpm"
RPM_HASH = "c5e1edc84c7a96208b8cf85540808f82c8abd851956d57302da7c24d34d9d71750542f19bb13bd819067c90b3c43914392756755d27fda76fee7270b153da26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acmart-doc"

RDEPENDS:${PN} += ""

inherit rpm
