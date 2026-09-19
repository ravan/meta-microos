SUMMARY = "Documentation for texlive-nanumtype1"
DESCRIPTION = "This package includes the documentation for texlive-nanumtype1"
LICENSE = "OFL-1.1"

PV = "2026.226.3.0svn29558"

RPM_NAME = "texlive-nanumtype1-doc-2026.226.3.0svn29558-61.2.noarch.rpm"
RPM_HASH = "16dfa211f0efedb6e4dedb42cb56e62286f79fd852ea1136fa14ef3dfc616f71e4e0c8aa02a1081548af12c555df8fc5e174dbc8e76b14b7fe845fa4bc65c0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nanumtype1-doc"

RDEPENDS:${PN} += ""

inherit rpm
