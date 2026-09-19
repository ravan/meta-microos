SUMMARY = "Documentation for texlive-koma-moderncvclassic"
DESCRIPTION = "This package includes the documentation for texlive-koma-moderncvclassic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn25025"

RPM_NAME = "texlive-koma-moderncvclassic-doc-2026.226.0.0.5svn25025-63.2.noarch.rpm"
RPM_HASH = "8f1b6e3b1dcf6d146d001c72cdefc45e50d4af7a91b04307ad0a6f6b7910b94e87db85f6b1b94860a560bcf4f456ead25c0479169bf1ed96480e5e9495b30259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-moderncvclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
