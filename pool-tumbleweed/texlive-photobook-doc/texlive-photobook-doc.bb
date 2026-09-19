SUMMARY = "Documentation for texlive-photobook"
DESCRIPTION = "This package includes the documentation for texlive-photobook"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.1.31svn71843"

RPM_NAME = "texlive-photobook-doc-2026.226.0.0.1.31svn71843-58.2.noarch.rpm"
RPM_HASH = "61850621ae84983c5ed44cbc785d0f1fc955605b737370daa40e567af20407c3948352665b0051b427f4f45613a7bc9877f52033efc791a70b0067fe2a89f2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-photobook-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
