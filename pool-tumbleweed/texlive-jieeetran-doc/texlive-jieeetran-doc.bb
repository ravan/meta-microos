SUMMARY = "Documentation for texlive-jieeetran"
DESCRIPTION = "This package includes the documentation for texlive-jieeetran"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn76924"

RPM_NAME = "texlive-jieeetran-doc-2026.226.0.0.19svn76924-63.2.noarch.rpm"
RPM_HASH = "163b44aa6207139091e1e1274636626c35a9f5f4950ca7c365b65c30a8e3e608dbcab5d4574a66090db42f4cf501b258e394b4f948306d33a9cffbe84019654f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jieeetran-doc-ja \
texlive-jieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
