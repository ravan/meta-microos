SUMMARY = "Documentation for texlive-beamertheme-light"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-light"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn73158"

RPM_NAME = "texlive-beamertheme-light-doc-2026.226.1.2svn73158-61.2.noarch.rpm"
RPM_HASH = "0c185595c7a558bec711287a2f64f04be5bbad18ea99c676430508fb049916fea74eb2dc201f9136332944ff201baba64de484123863b2f226b4bd920a472c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-light-doc"

RDEPENDS:${PN} += ""

inherit rpm
