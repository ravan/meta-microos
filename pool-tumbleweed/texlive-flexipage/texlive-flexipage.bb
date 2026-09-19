SUMMARY = "Flexible page geometry with marginalia"
DESCRIPTION = "This package allows easy page layout if marginalia is required. \
Mid document changes are possible such as: new marginal width, \
full width text, and landscape text without marginal. Partners \
well with the package sidenotesplus. The package also aids the \
layout for book printing, allowing for binding corrections and \
adding page bleed, if required."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn66614"

RPM_NAME = "texlive-flexipage-2026.226.1.02svn66614-59.2.noarch.rpm"
RPM_HASH = "5a15c24faea06ea17173756d6cc56fc1d13721c4585c8034d7de6285e8abba0d841cf1f74b5acc65daf17fd45a767c1d7fb8c8ede639bd435083bf1f9903d3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flexipage.sty \
texlive-flexipage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fp.sty \
tex-graphics.sty \
tex-ifoddpage.sty \
tex-l3keys2e.sty \
tex-mparhack.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
