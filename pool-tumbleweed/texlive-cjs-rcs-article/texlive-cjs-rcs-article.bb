SUMMARY = "Article class for The Canadian Journal of Statistics"
DESCRIPTION = "The document class cjs-rcs-article and its companion \
bibliographic styles cjs-rcs-en and cjs-rcs-fr typeset \
manuscripts immediately in accordance with the presentation \
rules of The Canadian Journal of Statistics. The package also \
contains the official Author guidelines for The Canadian \
Journal of Statistics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76790"

RPM_NAME = "texlive-cjs-rcs-article-2026.226.1.3svn76790-60.2.noarch.rpm"
RPM_HASH = "3322cf53725e14a1f701ec498a81c837f28b50b116f3a99057c8c2e6b1ff6c6b7482c2b4a3a550114bd7e86d666b6349f5514ab0a911aab0d92848e14a0ce782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cjs-rcs-article.cls \
texlive-cjs-rcs-article"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-FiraSans.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-fontawesome5.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-lineno.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-natbib.sty \
tex-numprint.sty \
tex-paracol.sty \
tex-ragged2e.sty \
tex-relsize.sty \
tex-stix2.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
