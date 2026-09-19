SUMMARY = "Documentation for texlive-beamerthemeamurmaple"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemeamurmaple"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn69742"

RPM_NAME = "texlive-beamerthemeamurmaple-doc-2026.226.1.3svn69742-61.2.noarch.rpm"
RPM_HASH = "f9bd952b97d529288c229f23fcfa1b2bbb04d435cd6069fb2b4500fd0b25319d4ad76e138e18d885d838eb511111603c3ee74b6489ab09602cae1dee17845f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemeamurmaple-doc"

RDEPENDS:${PN} += ""

inherit rpm
