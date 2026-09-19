SUMMARY = "Documentation for texlive-beamertheme-npbt"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-npbt"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.1svn54512"

RPM_NAME = "texlive-beamertheme-npbt-doc-2026.226.4.1svn54512-61.2.noarch.rpm"
RPM_HASH = "a8e480a1034cdd57c0cf8763a46978c1ca9b0b7aeed81120f392733795cc487627559497584c3a0d13e0215f87ed4f10ff3d766e653187a68ddfaa6804c1092a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-npbt-doc"

RDEPENDS:${PN} += ""

inherit rpm
