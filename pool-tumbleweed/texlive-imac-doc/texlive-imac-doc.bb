SUMMARY = "Documentation for texlive-imac"
DESCRIPTION = "This package includes the documentation for texlive-imac"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn17347"

RPM_NAME = "texlive-imac-doc-2026.226.svn17347-60.2.noarch.rpm"
RPM_HASH = "1373f9d796a105788d424b619a5f66739b5ecd5277a375ebf2a6733c87c2410a447f261dd0d2b0806d32b0a3544e6b975b4e958d46cc2c5f9af1aa57a10c1572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imac-doc"

RDEPENDS:${PN} += ""

inherit rpm
