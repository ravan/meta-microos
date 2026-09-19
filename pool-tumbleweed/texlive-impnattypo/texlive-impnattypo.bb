SUMMARY = "Support typography of l'Imprimerie Nationale Francaise"
DESCRIPTION = "The package provides useful macros implementing recommendations \
by the French Imprimerie Nationale."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn50227"

RPM_NAME = "texlive-impnattypo-2026.226.1.5svn50227-60.2.noarch.rpm"
RPM_HASH = "c7fccdf0c7ef3ebb5b1c455e105c3a0b55f59c6d246ce0c36667bb938c7a091a6301c89206fa0efb943c299d53c8f225afabe79f475b30d31a4e74ec851bf2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-impnattypo.sty \
texlive-impnattypo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
