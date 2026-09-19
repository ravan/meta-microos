SUMMARY = "Create a frontispiece for Italian theses"
DESCRIPTION = "Typesetting a frontispiece independently of the layout of the \
main document is difficult. This package provides a solution by \
producing an auxiliary TeX file to be typeset on its own and \
the result is automatically included at the next run. The \
markup necessary for the frontispiece is written in the main \
document in a frontespizio environment. Documentation is mainly \
in Italian, as the style is probably apt only to theses in \
Italy."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4asvn24054"

RPM_NAME = "texlive-frontespizio-2026.226.1.4asvn24054-60.2.noarch.rpm"
RPM_HASH = "903c3788db5e30face7413d3462569b233ee81b71a3712d2c6753003cde6e931c70254d730be74029cebed7f48874b5e3e8a1201a32954e0c9b5598477257cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frontespizio.sty \
texlive-frontespizio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-atbegshi.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
