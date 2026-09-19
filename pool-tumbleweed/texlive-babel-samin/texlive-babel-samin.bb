SUMMARY = "Babel support for Samin"
DESCRIPTION = "The package provides the language definition file for support \
of North Sami in babel. (Several Sami dialects/languages are \
spoken in Finland, Norway, Sweden and on the Kola Peninsula of \
Russia). Not all use the same alphabet, and no attempt is made \
to support any other than North Sami here. Some shortcuts are \
defined, as well as translations to Norsk of standard 'LaTeX \
names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0dsvn77682"

RPM_NAME = "texlive-babel-samin-2026.226.1.0dsvn77682-60.2.noarch.rpm"
RPM_HASH = "fa0f92d73ebe26823e7283e2f2c8652117d9bacadfc25ebca6f3cc338f0e6760751dc19b019e50d0afc899fe96419cd4cdd43b60be28c755a3bded28d084ed07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-northernsami.ldf \
tex-samin.ldf \
texlive-babel-samin"

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
