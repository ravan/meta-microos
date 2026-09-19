SUMMARY = "A-Eskwadraat package catalogue"
DESCRIPTION = "This is the official package catalogue of the A-Eskwadraat \
association. A-Eskwadraat is the study association for \
mathematics and physics at Utrecht University. The catalogue \
includes packages for meeting notes, a beamer theme, invoices \
and letters. The beamer theme can also be used for Utrecht \
University-styled presentations. Do refer to the UU website for \
information on logo use."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.1svn75506"

RPM_NAME = "texlive-aeskwadraat-2026.226.1.0.1svn75506-61.2.noarch.rpm"
RPM_HASH = "b303293b33ceaf20ab99542dbb92fc4c04702e56436b0e46c0b9002c37f5742590fd44be8d09ac7c50bed633be1117a3d62b63a06b3710d825e1e5c6f3fc403f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aes.sty \
tex-aeskwadraat.sty \
tex-aeskwadraatbrief.cls \
tex-aeskwadraatfactuur.sty \
tex-aeskwadraatnotulen.cls \
tex-aeskwadraatnotulen.sty \
tex-aeskwadraattaal.sty \
tex-beamerthemeaes2.sty \
tex-beamerthemeaeskwadraat.sty \
texlive-aeskwadraat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-calc.sty \
tex-epsfig.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-kix.sty \
tex-lineno.sty \
tex-merriweather.sty \
tex-newtxtext.sty \
tex-substr.sty \
tex-tikz.sty \
tex-tikzducks.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
