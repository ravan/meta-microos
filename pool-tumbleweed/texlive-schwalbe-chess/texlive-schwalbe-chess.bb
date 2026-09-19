SUMMARY = "Typeset the German chess magazine 'Die Schwalbe'"
DESCRIPTION = "The package is based on chess-problem-diagrams, which in its \
turn has a dependency on the bartel-chess-fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.13svn78101"

RPM_NAME = "texlive-schwalbe-chess-2026.226.2.13svn78101-60.2.noarch.rpm"
RPM_HASH = "8cdf10766dc0c6c04f43afe5ade6b449b97bbca001d35c3688301bac9fd04dcc2e3ce595e18fb99869117fa21454930f80be0543053c017eee69f9f5d9aa99ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schwalbe.cls \
tex-schwalbe.sty \
tex-swruler.sty \
texlive-schwalbe-chess"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-article.cls \
tex-babel.sty \
tex-calc.sty \
tex-cpdparse.sty \
tex-diagram.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-multicol.sty \
tex-paralist.sty \
tex-times.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
