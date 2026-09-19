SUMMARY = "Typeset and convert units for cookery books and recipes"
DESCRIPTION = "The package provides commands to typeset amounts and units \
consistently and offers an easy-to-use key-value syntax to \
convert one unit into another (for example 'dag' to 'g'; see \
the documentation for more examples). This packages requires \
expl3 and xparse, translations, xfrac, l3keys2e, and, \
optionally, fmtcount."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.00svn76924"

RPM_NAME = "texlive-cooking-units-2026.226.3.00svn76924-61.2.noarch.rpm"
RPM_HASH = "30c6f618f796e4afbd5b086f8f3196538b071aa214e344dd90c262b9ddc2fbdaeb46ce3a2c87dc8654ca138037348e8a7dbea1454ee176384ae47d5fe35d55e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooking-units.sty \
texlive-cooking-units"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fmtcount.sty \
tex-l3keys2e.sty \
tex-translations.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
