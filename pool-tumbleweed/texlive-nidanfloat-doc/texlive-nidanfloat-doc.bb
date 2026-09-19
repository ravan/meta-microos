SUMMARY = "Documentation for texlive-nidanfloat"
DESCRIPTION = "This package includes the documentation for texlive-nidanfloat"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nidanfloat-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "f67e748ef93e4f1dd5d9fe1734d0b305a3aecd8254e5e24517fa95a1417be700147794c7c5bb9c6d325a05690d37ed2526ce732d627b2e0b764e03e488bd0ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nidanfloat-doc-ja \
texlive-nidanfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
