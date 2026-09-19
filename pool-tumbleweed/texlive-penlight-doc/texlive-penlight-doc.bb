SUMMARY = "Documentation for texlive-penlight"
DESCRIPTION = "This package includes the documentation for texlive-penlight"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73362"

RPM_NAME = "texlive-penlight-doc-2026.226.svn73362-58.2.noarch.rpm"
RPM_HASH = "45e7376c025a63df1a9d7c0d21c38a51cc124ab8aab7074808c90e067dda210b12822589fbe7ee8e84175b2253f30cf2f76db7b2d9e258894de290cdc7505510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-penlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
