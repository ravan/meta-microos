SUMMARY = "Documentation for texlive-paratype"
DESCRIPTION = "This package includes the documentation for texlive-paratype"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-paratype-doc-2026.226.svn77682-58.2.noarch.rpm"
RPM_HASH = "dcf81958d50cd057b52be8eda1d155a3d8d7f8d0b44769e3c06378105ad2b6bc55779b4c9c46a5e1315192699b88b457ec3edbd2e295e884b3fda9cbeeec22b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paratype-doc"

RDEPENDS:${PN} += ""

inherit rpm
