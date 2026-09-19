SUMMARY = "A package for German lawyers"
DESCRIPTION = "RATeX is a newly developed bundle of packages and classes \
provided for German lawyers. Now in the early beginning it only \
contains rtklage, a class to make lawsuits."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-rtklage-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "b9c98ac6582bafd5d9f4d2d8e4d16f2a51e73681d9e7e0a06ff3882dcbe3764d1efb1ad6c180d5af29785ce675434fe4b44592951f8ef330d8abfe12aa8beb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rtklage.cls \
texlive-rtklage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphanum.sty \
tex-babel.sty \
tex-calc.sty \
tex-color.sty \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-numprint.sty \
tex-scrdate.sty \
tex-twoopt.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
