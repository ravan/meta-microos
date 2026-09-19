SUMMARY = "LaTeX class file for the Marathi journal 'Aalok'"
DESCRIPTION = "aalok mraatthii niytkaalikaacii akssrjulnnii krnnyaakritaa \
laattek-vrg. This package provides the class file for \
typesetting 'Aalok', a Marathi journal with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn76924"

RPM_NAME = "texlive-aalok-2026.226.0.0.6svn76924-61.2.noarch.rpm"
RPM_HASH = "7ce76ecfada962925f23697c0528c286d9ddf4b17522ab016925653e3d316c5b73b8a65394ab94388974e1e0d7bc067d1c59f87cd29cea846663dce9bd26d48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aalok.cls \
texlive-aalok"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-diagbox.sty \
tex-etoolbox.sty \
tex-expex.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontawesome5.sty \
tex-graphicx.sty \
tex-marathi.sty \
tex-mdframed.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-minitoc.sty \
tex-paracol.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tocloft.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
