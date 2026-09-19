SUMMARY = "Documentation for texlive-babel-hebrew"
DESCRIPTION = "This package includes the documentation for texlive-babel-hebrew"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn77914"

RPM_NAME = "texlive-babel-hebrew-doc-2026.226.2.5svn77914-60.2.noarch.rpm"
RPM_HASH = "6cd4d08b3fbfdd9ded415dabd24d5079be94ed0f63cbd56c3f7eb16ef4a567d741be194e2fa5f472e8ffaf3bb4cd8a96fe8870086aaba6b1d054ccb2d49dc776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-hebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
