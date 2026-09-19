SUMMARY = "Documentation for texlive-concmath"
DESCRIPTION = "This package includes the documentation for texlive-concmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17219"

RPM_NAME = "texlive-concmath-doc-2026.226.svn17219-60.2.noarch.rpm"
RPM_HASH = "82cb11f7269fecbcc24828193fb10658e1138ed65a5e6d3c82447c047d1f545e05a9d861bc654ada343aee4750df7ef0c2cb1b5a76d91c33268196380dda5957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
