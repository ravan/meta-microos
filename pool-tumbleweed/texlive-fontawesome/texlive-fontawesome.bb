SUMMARY = "Font containing web-related icons"
DESCRIPTION = "The package offers access to the large number of web-related \
icons provided by the included font. The package requires the \
package, fontspec, if run with XeTeX or LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-2026.226.4.6.3.2svn48145-60.2.noarch.rpm"
RPM_HASH = "dce74dc4ad7d02b1a270dae70b87ffe0cab35835c2de780471741518f4cfbfcb941055243dc536d8b2e885e79cc664f0dd83c683c2fe2e0d527865c91c22629f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FontAwesome--fontawesomeone.tfm \
tex-FontAwesome--fontawesomethree.tfm \
tex-FontAwesome--fontawesometwo.tfm \
tex-fontawesome.map \
tex-fontawesome.sty \
tex-fontawesomeone.enc \
tex-fontawesomesymbols-generic.tex \
tex-fontawesomesymbols-pdftex.tex \
tex-fontawesomesymbols-xeluatex.tex \
tex-fontawesomethree.enc \
tex-fontawesometwo.enc \
tex-ufontawesomeone.fd \
tex-ufontawesomethree.fd \
tex-ufontawesometwo.fd \
texlive-fontawesome"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fontawesome-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
