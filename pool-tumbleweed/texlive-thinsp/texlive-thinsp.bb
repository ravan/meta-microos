SUMMARY = "A stretchable \\thinspace for LaTeX"
DESCRIPTION = "The package redefines \\thinspace to have a stretch component."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn39669"

RPM_NAME = "texlive-thinsp-2026.227.0.0.2svn39669-62.2.noarch.rpm"
RPM_HASH = "0bb894498fdaf96b4fc46574eb05a5e66651d481b912edb991e0ee69dfbc5d08ab9fecdb125f85b553e293431bb272262d85eaf1a46c846d5b6f3daa3dd88895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thinsp.sty \
texlive-thinsp"

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
