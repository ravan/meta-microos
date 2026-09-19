SUMMARY = "Documentation for texlive-statistics"
DESCRIPTION = "This package includes the documentation for texlive-statistics"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.2svn67201"

RPM_NAME = "texlive-statistics-doc-2026.226.2.2svn67201-64.2.noarch.rpm"
RPM_HASH = "b3c95eee5f608a265ac8bd49aeb7d737f26cf6d95c504d54bcd90f184326e0a91443254c2cec7157d2af7c342351f97c1aa9819ec5dc3745068a3e5b88753e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statistics-doc"

RDEPENDS:${PN} += ""

inherit rpm
