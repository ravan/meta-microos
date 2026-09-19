SUMMARY = "Documentation for texlive-decimalcomma"
DESCRIPTION = "This package includes the documentation for texlive-decimalcomma"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn69251"

RPM_NAME = "texlive-decimalcomma-doc-2026.226.1.4svn69251-59.2.noarch.rpm"
RPM_HASH = "74f0e87b579ac16af38c7c78cfdb07ef632fff27dc2430119893decf7ea4b4beb2844c6c9b8795d0e21a0633316477e2041654f3249eb162443a703ca1993d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decimalcomma-doc"

RDEPENDS:${PN} += ""

inherit rpm
