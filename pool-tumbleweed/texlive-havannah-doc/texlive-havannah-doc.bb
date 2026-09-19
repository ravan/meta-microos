SUMMARY = "Documentation for texlive-havannah"
DESCRIPTION = "This package includes the documentation for texlive-havannah"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn36348"

RPM_NAME = "texlive-havannah-doc-2026.226.svn36348-60.4.noarch.rpm"
RPM_HASH = "649ff5b7e4bc397a7baf2c29fddf0a67ae5177bea43a86b37441b85a3aa921969a7f0debd4bd1be33c329977e5bd961dd49c17e9e602459e1967960287a52613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-havannah-doc"

RDEPENDS:${PN} += ""

inherit rpm
