SUMMARY = "Support for old German fonts"
DESCRIPTION = "A LaTeX interface to the old-german fonts designed by Yannis \
Haralambous: Gothic, Schwabacher, Fraktur and the baroque \
initials."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-yfonts-2026.226.1.4svn77682-59.4.noarch.rpm"
RPM_HASH = "da6636f3fba8548083a7f68124fd102b205405b18dba158185b759250312d5bc5b9f3cfda91b868095e812e5798ef7d2069e22ec66f6b61efaf73963403e6011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yfonts.sty \
texlive-yfonts"

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
