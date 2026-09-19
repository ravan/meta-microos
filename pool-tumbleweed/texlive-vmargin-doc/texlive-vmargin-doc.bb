SUMMARY = "Documentation for texlive-vmargin"
DESCRIPTION = "This package includes the documentation for texlive-vmargin"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn15878"

RPM_NAME = "texlive-vmargin-doc-2026.226.2.5svn15878-60.2.noarch.rpm"
RPM_HASH = "62dcf402360fa0537b7969115c0a65ccdd2fc6ebac915bd67bd41788bc0758a23e94c4bd5f765f213a9f4bc40dc5d3c814eab669f1d364279f073a21a6325df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vmargin-doc"

RDEPENDS:${PN} += ""

inherit rpm
