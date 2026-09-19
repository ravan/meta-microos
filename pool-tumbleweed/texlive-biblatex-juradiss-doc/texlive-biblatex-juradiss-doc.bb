SUMMARY = "Documentation for texlive-biblatex-juradiss"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-juradiss"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23svn77682"

RPM_NAME = "texlive-biblatex-juradiss-doc-2026.226.0.0.23svn77682-61.2.noarch.rpm"
RPM_HASH = "557bd29726d13b96c874b4cfb630e94adcc0bf7e13afc9eb76779b667423895d7b71bb0d50812d31002d74665f780d28bac5cb28776efb59ad7bb18835ee68f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-juradiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
