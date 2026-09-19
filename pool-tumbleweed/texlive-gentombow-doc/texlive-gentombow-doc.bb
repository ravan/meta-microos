SUMMARY = "Documentation for texlive-gentombow"
DESCRIPTION = "This package includes the documentation for texlive-gentombow"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gentombow-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "573a1045560acb0f9fc5d57c62a37cc2c19df301c020143fb0899f61ef4c42e1ac4c015b4857be92e851797f0ee749a4a4c21af8440106d0ded8cc1ec992c033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gentombow-doc-ja \
texlive-gentombow-doc"

RDEPENDS:${PN} += ""

inherit rpm
