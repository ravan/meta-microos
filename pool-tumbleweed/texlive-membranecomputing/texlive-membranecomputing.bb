SUMMARY = "Membrane Computing notation"
DESCRIPTION = "This is a LaTeX package for the Membrane Computing community. \
It comprises the definition of P systems, rules and some \
concepts related to languages and computational complexity \
usually needed for Membrane Computing research. The package \
depends on ifthen and xstring."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn64627"

RPM_NAME = "texlive-membranecomputing-2026.226.0.0.2.1svn64627-59.2.noarch.rpm"
RPM_HASH = "d14abf908acea7126c81b5d6b0cac9c14318d2bda1761ef53d6848e6d05ac503049c8b609a0ffcbf344b5eb568aab03e303bbf1ef4a338cd4333539b18efb065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-membranecomputing.sty \
texlive-membranecomputing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
