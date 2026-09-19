SUMMARY = "Documentation for texlive-luaoptions"
DESCRIPTION = "This package includes the documentation for texlive-luaoptions"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn78101"

RPM_NAME = "texlive-luaoptions-doc-2026.226.0.0.8svn78101-59.2.noarch.rpm"
RPM_HASH = "14841699ff520fe54fa3ff190b25da9c231214a57fd1ed8b9d7d254f10c5c228d5e406148d1454f09c4b000d881e614d5a8eccea072f0f96662807a01da4487d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
