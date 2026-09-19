SUMMARY = "Documentation for texlive-fandol"
DESCRIPTION = "This package includes the documentation for texlive-fandol"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn37889"

RPM_NAME = "texlive-fandol-doc-2026.226.0.0.3svn37889-59.2.noarch.rpm"
RPM_HASH = "1dcbed19ea8404fb8b5767f57e36575a4aa78ff13cd75f2d442192fbd1d0937601890036ff1af170a1bca5b0b932d21cbec3dd3f34d3c73e2083912b2cf5bb7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fandol-doc"

RDEPENDS:${PN} += ""

inherit rpm
