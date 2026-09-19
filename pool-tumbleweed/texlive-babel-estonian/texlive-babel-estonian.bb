SUMMARY = "Babel support for Estonian"
DESCRIPTION = "The package provides the language definition file for support \
of Estonian in babel. Some shortcuts are defined, as well as \
translations to Estonian of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn38064"

RPM_NAME = "texlive-babel-estonian-2026.226.1.1asvn38064-60.2.noarch.rpm"
RPM_HASH = "477171b6aa10cdc16564f365d5fce0d520442e46824d053dd1beb148c34bc545479296c2e2742af9a0af2f17e2cd0c1d76de0fb2907cd70a249dc37b5e40e02e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-estonian.ldf \
texlive-babel-estonian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
