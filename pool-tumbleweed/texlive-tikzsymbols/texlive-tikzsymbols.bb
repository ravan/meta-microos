SUMMARY = "Some symbols created using TikZ"
DESCRIPTION = "The package provides various emoticons, cooking symbols and \
trees."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.12asvn61300"

RPM_NAME = "texlive-tikzsymbols-2026.226.4.12asvn61300-59.2.noarch.rpm"
RPM_HASH = "a2110ec72b9040c0ab04f95d0969fa945bedf25af4549a12b5408c863e640397a698d2db51c65c0810cf58439bbe1c0251aa49d1ee518df98831c28903d5c9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzsymbols.sty \
texlive-tikzsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
