SUMMARY = "Typeset Algobox programs"
DESCRIPTION = "This LaTeX package can typeset Algobox programs almost exactly \
as displayed when editing with Algobox itself, using an input \
syntax very similar to the actual Algobox program text. It \
gives better results than Algobox's own LaTeX export which does \
not look like the editor rendition, produces standalone \
documents cumbersome to customize, and has arbitrary and \
inconsistent differences between the input syntax and the \
program text. This package depends upon the following other \
LaTeX packages: expl3, TikZ, environ, xparse, and xcolor."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn67201"

RPM_NAME = "texlive-algobox-2026.226.1.3svn67201-61.2.noarch.rpm"
RPM_HASH = "1305f216ec8d871cb91b170d3c263516ce2a23f03ff004b450463e193a8454d4acf2bf79890a2e29f3cfa082dce1a24051c212d6a282cd94e9536ac7567524e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algobox.sty \
texlive-algobox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
