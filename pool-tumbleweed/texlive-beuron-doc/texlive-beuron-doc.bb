SUMMARY = "Documentation for texlive-beuron"
DESCRIPTION = "This package includes the documentation for texlive-beuron"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn46374"

RPM_NAME = "texlive-beuron-doc-2026.226.1.3svn46374-61.2.noarch.rpm"
RPM_HASH = "0d5ad2c90336128c69c99f252750541c761763f0ce9941860b0f7dd52e3f0a195962c16d4122bdfb050491c55102abab4f6bef45fbf98b22d64df97a016352a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beuron-doc-de;en \
texlive-beuron-doc"

RDEPENDS:${PN} += ""

inherit rpm
