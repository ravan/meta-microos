SUMMARY = "Typesetting Magic and Latin squares"
DESCRIPTION = "The package provides typesetting of magic and latin squares."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77881"

RPM_NAME = "texlive-context-squares-2026.226.svn77881-61.2.noarch.rpm"
RPM_HASH = "7db07d6cd9f89cdc869d21e081819bf12169a5e1bd54cad374b494facddbbcf2b4ca53f84c5209fecb45fd9dbc334bf7f44b984cbf9cff59af5b2ae9132d54c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-squares"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
