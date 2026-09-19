SUMMARY = "Documentation for texlive-fig4latex"
DESCRIPTION = "This package includes the documentation for texlive-fig4latex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn26313"

RPM_NAME = "texlive-fig4latex-doc-2026.226.0.0.2svn26313-59.2.noarch.rpm"
RPM_HASH = "6b34cf2dd78a7247a0b20178319d697a9218dac713b25f4cc71067f92d7c2a969bd2c78beacf0aa9db09109426e7801d5ee947babefead5edb37fd89339812df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fig4latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
