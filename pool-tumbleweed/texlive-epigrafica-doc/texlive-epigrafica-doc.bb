SUMMARY = "Documentation for texlive-epigrafica"
DESCRIPTION = "This package includes the documentation for texlive-epigrafica"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.01svn17210"

RPM_NAME = "texlive-epigrafica-doc-2026.226.1.01svn17210-61.4.noarch.rpm"
RPM_HASH = "a0e5454bedde072f74c5950f8f294b977e8a8900b2684a0642b63e937e855fbf4ed9531aaf13a76ad83e575d7033cdec77e93696617f78f6e2f405e95a801615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigrafica-doc"

RDEPENDS:${PN} += ""

inherit rpm
