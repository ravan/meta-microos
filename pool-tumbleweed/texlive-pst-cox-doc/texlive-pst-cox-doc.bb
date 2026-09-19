SUMMARY = "Documentation for texlive-pst-cox"
DESCRIPTION = "This package includes the documentation for texlive-pst-cox"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.98_betasvn15878"

RPM_NAME = "texlive-pst-cox-doc-2026.226.0.0.98_betasvn15878-59.2.noarch.rpm"
RPM_HASH = "d83e57dab0839e6007c53fc588769d148a0037fe886d44f61e6a0bffa311c4b3a907d385184d85dbe97af599a17dd641b98e374f1621d71bf47195c8713c4501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-cox-doc-en \
texlive-pst-cox-doc"

RDEPENDS:${PN} += ""

inherit rpm
