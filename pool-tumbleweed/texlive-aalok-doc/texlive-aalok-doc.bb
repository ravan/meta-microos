SUMMARY = "Documentation for texlive-aalok"
DESCRIPTION = "This package includes the documentation for texlive-aalok"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn76924"

RPM_NAME = "texlive-aalok-doc-2026.226.0.0.6svn76924-61.2.noarch.rpm"
RPM_HASH = "b7f3fa8176b84982e967096952dda9c03ffcf07fac255947b22452fea5ae83303601482e9397002e7f7826e24932a5733e46ba864a95b5feab9455bb46864158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-aalok-doc-mr \
texlive-aalok-doc"

RDEPENDS:${PN} += ""

inherit rpm
