SUMMARY = "Documentation for texlive-udes-genie-these"
DESCRIPTION = "This package includes the documentation for texlive-udes-genie-these"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.0svn68141"

RPM_NAME = "texlive-udes-genie-these-doc-2026.226.3.1.0svn68141-60.2.noarch.rpm"
RPM_HASH = "3c20dab2be66f686753a4983b030d25ef567ad069c348396d6f4f0551ae2413d0bafc2a142ef6d2d84f6a9369fc433bc5b974ef42a56c26829ff6051cb8fa854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-udes-genie-these-doc-fr-ca \
texlive-udes-genie-these-doc"

RDEPENDS:${PN} += ""

inherit rpm
