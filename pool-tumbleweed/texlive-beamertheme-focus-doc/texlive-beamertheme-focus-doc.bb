SUMMARY = "Documentation for texlive-beamertheme-focus"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-focus"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.4.0svn69742"

RPM_NAME = "texlive-beamertheme-focus-doc-2026.226.3.4.0svn69742-61.2.noarch.rpm"
RPM_HASH = "43c3c910c49538a45324a1058ec0a19718f62c784781c9161776019e8b7c34f19cce5ca8c26b9591bdb53c9e95d5b219cf7c3e094406728346e7592a70c7e94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-focus-doc"

RDEPENDS:${PN} += ""

inherit rpm
