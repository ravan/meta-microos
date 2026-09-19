SUMMARY = "Documentation for texlive-multiple-choice"
DESCRIPTION = "This package includes the documentation for texlive-multiple-choice"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn63722"

RPM_NAME = "texlive-multiple-choice-doc-2026.226.0.0.2svn63722-61.2.noarch.rpm"
RPM_HASH = "0d0c191f23e430a0e510a7b75b280435b73ff7ef22806cefdd65bf71980a4cd5f4ba6d7a82d19863545477fcf93af270208e2a2344c0c6050536c153c792103b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiple-choice-doc"

RDEPENDS:${PN} += ""

inherit rpm
