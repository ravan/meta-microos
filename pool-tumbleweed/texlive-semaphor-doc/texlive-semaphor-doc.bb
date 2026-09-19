SUMMARY = "Documentation for texlive-semaphor"
DESCRIPTION = "This package includes the documentation for texlive-semaphor"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn18651"

RPM_NAME = "texlive-semaphor-doc-2026.226.svn18651-60.2.noarch.rpm"
RPM_HASH = "c1bb0a3e1c8c802d2ebba7ca20d679f7ef7b2ad5deaaae4ee24e4c1243c1272e3d2da35411e7e61480229e1b0fb6a63c1cd17026df1b7cb01d6469b55e83ff5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semaphor-doc"

RDEPENDS:${PN} += ""

inherit rpm
