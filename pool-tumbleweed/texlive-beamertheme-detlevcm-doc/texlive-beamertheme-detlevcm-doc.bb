SUMMARY = "Documentation for texlive-beamertheme-detlevcm"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-detlevcm"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.02svn39048"

RPM_NAME = "texlive-beamertheme-detlevcm-doc-2026.226.1.02svn39048-61.2.noarch.rpm"
RPM_HASH = "09f4816157459045160cabbabdc4dbdd5c97bf2318677408bcc5d3352768f6f2c1ea96e295fe11d136d3299955b23aab8af9de19e0d31b27f4a870b340af0640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-detlevcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
