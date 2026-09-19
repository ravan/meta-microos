SUMMARY = "Documentation for texlive-mlmodern"
DESCRIPTION = "This package includes the documentation for texlive-mlmodern"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-mlmodern-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "7be29f3fb368fe7e54f2a91e9f79516b8827820cf4df97ced2d74385b8805687a8dd6d481cf65b293aef747aa7347c2f134b2d50015279999ba27eeb23a57257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlmodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
