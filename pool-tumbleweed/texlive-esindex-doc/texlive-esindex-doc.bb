SUMMARY = "Documentation for texlive-esindex"
DESCRIPTION = "This package includes the documentation for texlive-esindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn71111"

RPM_NAME = "texlive-esindex-doc-2026.226.1.8svn71111-61.4.noarch.rpm"
RPM_HASH = "cf775cba885ddf061a315ee3972352cc51168a271fcf8f4d3fdaa93f884e897deeaa3f87c6d983f92cda94a8ffe3ca2b414d423b1641a884aea5137e50c09740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
