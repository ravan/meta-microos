SUMMARY = "Documentation for texlive-smart-eqn"
DESCRIPTION = "This package includes the documentation for texlive-smart-eqn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-smart-eqn-doc-2026.226.1.0svn76924-64.2.noarch.rpm"
RPM_HASH = "82bbf6be0a161a7b867ab9ec1f9a3c23cb8922bcf473a6e83e02fc380d1dcb39c4dfa1e0c78ccd0c673415c09b5f655362f504a6abe6b5f14972fb0cb3b729a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smart-eqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
