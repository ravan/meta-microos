SUMMARY = "Documentation for texlive-mluexercise"
DESCRIPTION = "This package includes the documentation for texlive-mluexercise"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn56927"

RPM_NAME = "texlive-mluexercise-doc-2026.226.2.0svn56927-61.2.noarch.rpm"
RPM_HASH = "05ecd1e8d9f965b075ebc5b6d9bab2ff22dfa88b3355db1f999cddbf78b9ada99d8058df23566e168a90415d1fd6dd717c04cca09e2c35648c39c4d73cc0ac5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mluexercise-doc"

RDEPENDS:${PN} += ""

inherit rpm
