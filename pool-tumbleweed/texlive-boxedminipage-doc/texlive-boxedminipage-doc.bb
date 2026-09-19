SUMMARY = "Documentation for texlive-boxedminipage"
DESCRIPTION = "This package includes the documentation for texlive-boxedminipage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-boxedminipage-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "b7b4f8508a1492081037af7b55aee5f6ac6cf580125672346593f55cd202ce19ce9bee4a91c089f6f1aa9f22ec303a7c0ed3a23cad63d633a9bedd2a7b67e79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boxedminipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
