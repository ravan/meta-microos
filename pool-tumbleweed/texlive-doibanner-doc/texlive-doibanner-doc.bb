SUMMARY = "Documentation for texlive-doibanner"
DESCRIPTION = "This package includes the documentation for texlive-doibanner"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn71919"

RPM_NAME = "texlive-doibanner-doc-2026.226.0.0.3svn71919-59.2.noarch.rpm"
RPM_HASH = "9c63c196cd68b2a0b6f21f1bc7f73db3ae282e380f6528d8ea6f2f7cb67073a1880aa7384e6eb210e37fefe412d4f9d4376a38a9673e9cc40cc0e097f788278e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doibanner-doc"

RDEPENDS:${PN} += ""

inherit rpm
