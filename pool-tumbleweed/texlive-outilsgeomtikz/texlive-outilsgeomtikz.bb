SUMMARY = "Some geometric tools, with TikZ"
DESCRIPTION = "This package provides some commands, with French keys, to \
display geometric tools using TikZ, for example a pen, a \
compass, a rule, a square, a protractor, ..."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.7svn75985"

RPM_NAME = "texlive-outilsgeomtikz-2026.226.0.0.1.7svn75985-61.2.noarch.rpm"
RPM_HASH = "1b6ba9fad6a44aaf739bba43550468ec11d85eca5835bf9e2ac63cad93f24ec77d2d75ad279a54d3f8625898694de6d747b144ade231ab9de56e6db22c6d7db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OutilsGeomTikz.sty \
texlive-outilsgeomtikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-nicefrac.sty \
tex-pgffor.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
