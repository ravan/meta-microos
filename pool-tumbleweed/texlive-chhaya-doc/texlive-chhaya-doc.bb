SUMMARY = "Documentation for texlive-chhaya"
DESCRIPTION = "This package includes the documentation for texlive-chhaya"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.4svn61719"

RPM_NAME = "texlive-chhaya-doc-2026.226.0.0.4svn61719-60.2.noarch.rpm"
RPM_HASH = "072524298ba2eb7d5844eaad1f549a25aa422dee829227020ab4dc2b4ec944f56a62272fb8d914812b745791796f2d7cb7fa4d639a86a113cf1f253c7c08b814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chhaya-doc-mr \
texlive-chhaya-doc"

RDEPENDS:${PN} += ""

inherit rpm
