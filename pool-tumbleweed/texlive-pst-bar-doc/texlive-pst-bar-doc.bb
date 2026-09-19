SUMMARY = "Documentation for texlive-pst-bar"
DESCRIPTION = "This package includes the documentation for texlive-pst-bar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.93svn64331"

RPM_NAME = "texlive-pst-bar-doc-2026.226.0.0.93svn64331-59.2.noarch.rpm"
RPM_HASH = "5b8c589a54aa37079176547dd9113cc744aab60bc52af6966ad51f152ff78d6206074d490f1ef90f091c522b98384d42bdacaedf2ae5a05972a52c425725dc56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bar-doc"

RDEPENDS:${PN} += ""

inherit rpm
