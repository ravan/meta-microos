SUMMARY = "Documentation for texlive-cjs-rcs-article"
DESCRIPTION = "This package includes the documentation for texlive-cjs-rcs-article"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76790"

RPM_NAME = "texlive-cjs-rcs-article-doc-2026.226.1.3svn76790-60.2.noarch.rpm"
RPM_HASH = "bda766cfb83e997869c127de5313e6293ebf7f974c916d49ad3b45964ec00ba1f4f340f051f56455d9933e6d8d96aa344121f5cf73c7491cd0b253dc9527125d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cjs-rcs-article-doc-fr \
texlive-cjs-rcs-article-doc"

RDEPENDS:${PN} += ""

inherit rpm
