SUMMARY = "Typesetting a beautiful CV with various style options"
DESCRIPTION = "The class simplifies the creation of beautiful CV. The user may \
choose between different styles, and may adjust settings to \
tune the output."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn57721"

RPM_NAME = "texlive-komacv-2026.226.1.1.2svn57721-63.2.noarch.rpm"
RPM_HASH = "178ef8873fc68dc927ba2e91b60e6f36096ce56db03744d5063b8429924a796e96505730d72b11263e2bef142bf22bb6475a94efba0e9e86892f78cf506d0a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-komacv-casual.sty \
tex-komacv-classic.sty \
tex-komacv-oldstyle.sty \
tex-komacv.cls \
texlive-komacv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontawesome.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-ragged2e.sty \
tex-scrartcl.cls \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
