SUMMARY = "Vectorial logos (GeoGebra, Emacs, Scratch, ...) with 'inline' support"
DESCRIPTION = "With this package you can insert vectorial logos of some \
'classic' software. The format of the logos is pdf. The package \
provides macros to insert them inline, with automatic height \
and alignment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn73069"

RPM_NAME = "texlive-vectorlogos-2026.226.0.0.1.3svn73069-60.2.noarch.rpm"
RPM_HASH = "879ca32c1f607a5905e85542c2ac30150d65ed4c86e05d529cd3852fe905845b5b5f59893bc6f41ffb152a4b685b5eee0139fa4ceae38eda2801ea8d38988517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vectorlogos.sty \
texlive-vectorlogos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
