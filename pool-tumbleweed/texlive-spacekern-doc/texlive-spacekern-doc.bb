SUMMARY = "Documentation for texlive-spacekern"
DESCRIPTION = "This package includes the documentation for texlive-spacekern"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn67604"

RPM_NAME = "texlive-spacekern-doc-2026.226.0.0.3svn67604-64.2.noarch.rpm"
RPM_HASH = "ac9cedaace4fcccfbdc7c96d697ce758caba1623fe2f76f37748b65510a04b4d9eb1bd9d2d66dd1ff5fa6264a81640154ced0ed8dd4da03ff4090a5f51802bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spacekern-doc"

RDEPENDS:${PN} += ""

inherit rpm
