SUMMARY = "Documentation for texlive-mkpattern"
DESCRIPTION = "This package includes the documentation for texlive-mkpattern"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-mkpattern-doc-2026.226.1.2svn76924-61.2.noarch.rpm"
RPM_HASH = "eed386b088c0f4ec8ddb661238cf09e1ed4d8ae32cc5a43029e2fb113c01eaee2f098930eb9dff752e53ce9d00f41b785a8bae02eea3ff927ae096fb1c03e98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
