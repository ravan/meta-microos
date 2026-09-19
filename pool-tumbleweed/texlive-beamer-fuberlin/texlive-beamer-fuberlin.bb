SUMMARY = "Beamer, using the style of FU Berlin"
DESCRIPTION = "The bundle provides a beamer-derived class and a theme style \
file for the corporate design of the Free University in Berlin. \
Users may use the class itself (FUbeamer) or use the theme in \
the usual way with \\usetheme{BerlinFU}. Examples of using both \
the class and the theme are provided; the PDF is visually \
identical, so the catalogue only lists one; the sources of the \
examples do of course differ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02bsvn63161"

RPM_NAME = "texlive-beamer-fuberlin-2026.226.0.0.02bsvn63161-61.2.noarch.rpm"
RPM_HASH = "47fc055f0d6b60f8d881346c20b58acc8dcf13a7714b92388e95be53ff6f56d448578e889dda39f790cc20a2e8e6d3c7d311c26309bd9aaeb4134af070a1745c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FUbeamer.cls \
tex-beamercolorthemeBerlinFU.sty \
tex-beamerfontthemeBerlinFU.sty \
tex-beamerouterthemeBerlinFU.sty \
tex-beamerthemeBerlinFU.sty \
texlive-beamer-fuberlin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-beamer.cls \
tex-fontenc.sty \
tex-graphicx-psmin.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
