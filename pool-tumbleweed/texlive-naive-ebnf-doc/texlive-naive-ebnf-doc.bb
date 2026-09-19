SUMMARY = "Documentation for texlive-naive-ebnf"
DESCRIPTION = "This package includes the documentation for texlive-naive-ebnf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.18svn72843"

RPM_NAME = "texlive-naive-ebnf-doc-2026.226.0.0.0.18svn72843-61.2.noarch.rpm"
RPM_HASH = "df5fd0fdcef0fdd19b9b1fad944287041dddc52e68f6dec800905c37757e7e568ce8bc821da3ccabea34cda263f8d45fc5446a7942ea54f4a41628a4d09e16af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-naive-ebnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
