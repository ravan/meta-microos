SUMMARY = "Documentation for texlive-hyphen-spanish"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-spanish"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn78069"

RPM_NAME = "texlive-hyphen-spanish-doc-2026.226.5.0svn78069-60.2.noarch.rpm"
RPM_HASH = "7b9460daba6ae4739c011038413d0631c63ffb3ed448f62da9aad468ad9db028e7c29d60d65b92e8fe5d2ca29a61562a0873548be41bdbd5e6405e9a8fd2cdf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyphen-spanish-doc-es \
texlive-hyphen-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
