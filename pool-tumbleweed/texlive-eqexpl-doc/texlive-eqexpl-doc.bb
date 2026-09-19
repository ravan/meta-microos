SUMMARY = "Documentation for texlive-eqexpl"
DESCRIPTION = "This package includes the documentation for texlive-eqexpl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-doc-2026.226.1.1.1svn63629-61.4.noarch.rpm"
RPM_HASH = "9eeec82260ee0dc601df1e0c5d0d75af9705ab4241f0bb007717d607eb0c71e4823c5799c9d2e5fe30029ee185d4fe242703692891d67c3588e6e1a1c3a63c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eqexpl-doc-ru \
texlive-eqexpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
