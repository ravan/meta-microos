SUMMARY = "A language definition file for Mongolian in Babel"
DESCRIPTION = "This package provides support for Mongolian in a Cyrillic \
alphabet. (The work derives from the earlier Russian work for \
babel.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-mongolian-babel-2026.226.1.2svn15878-61.2.noarch.rpm"
RPM_HASH = "40b407e982b2aa33e5a1e1ac29ed513ee3aa633c8838d26fce87181080e5a58c373bfcc99ef0333648af881d77c310c906aab18af34da1d607be3bbc5e402259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mn.def \
tex-mongolian.ldf \
tex-mongolian.sty \
texlive-mongolian-babel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
