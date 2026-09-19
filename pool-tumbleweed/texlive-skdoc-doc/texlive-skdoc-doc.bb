SUMMARY = "Documentation for texlive-skdoc"
DESCRIPTION = "This package includes the documentation for texlive-skdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5esvn76924"

RPM_NAME = "texlive-skdoc-doc-2026.226.1.5esvn76924-64.2.noarch.rpm"
RPM_HASH = "f5e685c47dbb54a6c542b585fc133b08f821381f9dbd642f7e13e0f16541841a765c655cfc7a17169af7d31779266407888cf90115abc128fd877c49f8f05b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
