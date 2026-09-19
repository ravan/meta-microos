SUMMARY = "Documentation for texlive-fjodor"
DESCRIPTION = "This package includes the documentation for texlive-fjodor"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn53207"

RPM_NAME = "texlive-fjodor-doc-2026.226.svn53207-59.2.noarch.rpm"
RPM_HASH = "e69e24c9cb03c3a1bf75f9af5fc5dff706d8fe1aca7b72560f2ef1626f387ebfdd8598162e6c5f95bc85a51587490639aa80d643dcf978890efe57df14bb262d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fjodor-doc"

RDEPENDS:${PN} += ""

inherit rpm
