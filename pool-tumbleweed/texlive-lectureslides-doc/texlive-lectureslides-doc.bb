SUMMARY = "Documentation for texlive-lectureslides"
DESCRIPTION = "This package includes the documentation for texlive-lectureslides"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn62292"

RPM_NAME = "texlive-lectureslides-doc-2026.226.1.0svn62292-61.2.noarch.rpm"
RPM_HASH = "56a01e147e7e0c97b5a5084fe08f5ba1a3ae598a0066b436d7a47d35f553599335f503b2d81ff60b7055a10904de8397b351578bf5525683e9ebaecc278544f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lectureslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
