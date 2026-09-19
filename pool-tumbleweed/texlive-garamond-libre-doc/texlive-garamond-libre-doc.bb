SUMMARY = "Documentation for texlive-garamond-libre"
DESCRIPTION = "This package includes the documentation for texlive-garamond-libre"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-garamond-libre-doc-2026.226.1.4svn77682-60.2.noarch.rpm"
RPM_HASH = "70654bcb787f4348e024be675ffacf76ec9112fa8e0dde4913fd952a4ef1e46a3b36e2966d241f0046f2c29441803a2325ae374df60e1b418ae3051484d85673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-libre-doc"

RDEPENDS:${PN} += ""

inherit rpm
