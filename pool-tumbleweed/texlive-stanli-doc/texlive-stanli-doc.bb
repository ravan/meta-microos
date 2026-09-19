SUMMARY = "Documentation for texlive-stanli"
DESCRIPTION = "This package includes the documentation for texlive-stanli"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.0svn54512"

RPM_NAME = "texlive-stanli-doc-2026.226.3.0svn54512-64.2.noarch.rpm"
RPM_HASH = "e214eaa58a4e2f3580fe18950b7b3bd313130d630ed9aaf1e0f082841b5c508272aabe0a973075bf87a55dc2995000c5b95e2150a1684453ad9bc38276fa5c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stanli-doc"

RDEPENDS:${PN} += ""

inherit rpm
