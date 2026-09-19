SUMMARY = "Catcode table stable support"
DESCRIPTION = "This package provides a method for defining category code table \
stacks in LuaTeX. It builds on code provided by the 2015/10/01 \
release of LaTeX2e (also available as ltluatex.sty for plain \
users). It is required by the luatexbase package (v1.0 onward) \
which uses ctablestack to provide a back-compatibility form of \
this concept."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-ctablestack-2026.226.1.0svn78101-61.2.noarch.rpm"
RPM_HASH = "2c04cb802a28215c1ded2bd2e571f367ce6edbb6fe601e5380b652abd6f9214c41dd1e5b77aa77fe84ba37d7d52c155b06019ce16e1554271e6b4f6a202ce58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctablestack.sty \
texlive-ctablestack"

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
