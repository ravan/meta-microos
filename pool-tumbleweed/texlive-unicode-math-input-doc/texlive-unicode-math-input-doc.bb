SUMMARY = "Documentation for texlive-unicode-math-input"
DESCRIPTION = "This package includes the documentation for texlive-unicode-math-input"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-unicode-math-input-doc-2026.226.0.0.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "e3ac51f7db8f3d8a9d9a56cc88a3aa5b8d425a1f0a93e0a412f2ca0b0006b8f793d5811d2113b4278467567d116e2b71bd9750cc9b344ee621a96179fcb6a9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-math-input-doc"

RDEPENDS:${PN} += ""

inherit rpm
