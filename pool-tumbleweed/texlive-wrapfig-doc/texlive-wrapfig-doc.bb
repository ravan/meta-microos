SUMMARY = "Documentation for texlive-wrapfig"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-wrapfig-doc-2026.226.3.6svn77682-59.4.noarch.rpm"
RPM_HASH = "72c53c6107627fffe458d7d1e09e9844bffeef557b09330f9c05b430922167a64fba5bb64e8d6bc14a25001f8680a8604e21d4332629b18a952b5e25c0c3c39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
