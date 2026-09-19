SUMMARY = "Documentation for texlive-download"
DESCRIPTION = "This package includes the documentation for texlive-download"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn52257"

RPM_NAME = "texlive-download-doc-2026.226.1.2svn52257-59.2.noarch.rpm"
RPM_HASH = "4092894a5b7f2089e3f8000d5433f31313c43b62b0499eb580d3ea07a45fa976ba957b0638665ea3b8be352721cd156130f1b9976e66582c6fedffa375df3308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-download-doc"

RDEPENDS:${PN} += ""

inherit rpm
