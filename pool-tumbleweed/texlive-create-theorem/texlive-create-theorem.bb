SUMMARY = "Initializing and configuring theorem-like environments, with multilingual support"
DESCRIPTION = "This package provides commands for naming, initializing and \
configuring theorem-like environments. These commands have \
key-value based interfaces and are especially useful in \
multilingual documents, allowing the easy declaration of \
theorem-like environments that can automatically adapt to the \
language settings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-create-theorem-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "835451d79e52fe762e34fac83f884efe0e0e5f68e6724746ca803c64b8a4f8da4232a4645cb20235502077e6bc75d978a5b3bec1f96434c82ffc97572128e7d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-create-theorem-preset-names-cleveref.tex \
tex-create-theorem-preset-names-plural-cleveref.tex \
tex-create-theorem.sty \
texlive-create-theorem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-crefthe.sty \
texlive \
texlive-crefthe \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
