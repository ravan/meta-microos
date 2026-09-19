SUMMARY = "Documentation for texlive-xq"
DESCRIPTION = "This package includes the documentation for texlive-xq"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn78101"

RPM_NAME = "texlive-xq-doc-2026.226.0.0.4svn78101-59.4.noarch.rpm"
RPM_HASH = "33a792ab00f8f6664c56b2b022dc0863fe7a4a9fa97b5f8cb4977829358a458585eca1b1dbe79f1b8a306c5af28788b0ac1cd3e80290df2c8b7cfd1506966ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xq-doc"

RDEPENDS:${PN} += ""

inherit rpm
