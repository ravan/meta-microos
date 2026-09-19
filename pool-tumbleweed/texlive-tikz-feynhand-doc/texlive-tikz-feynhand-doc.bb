SUMMARY = "Documentation for texlive-tikz-feynhand"
DESCRIPTION = "This package includes the documentation for texlive-tikz-feynhand"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.0svn76924"

RPM_NAME = "texlive-tikz-feynhand-doc-2026.226.1.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "a373238753bd0b1c5aa40cb3cf3b8c4c62adc667f1f1b6153b5733c0c867d5ccfd3b9268f6fec274cddbb3df764614d0f0694c963551b7ca28daa8972b59eb52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-feynhand-doc"

RDEPENDS:${PN} += ""

inherit rpm
