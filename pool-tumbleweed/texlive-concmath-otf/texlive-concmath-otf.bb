SUMMARY = "Concrete based OpenType Math font"
DESCRIPTION = "This package provides an OpenType version of the Concrete Math \
font created by Ulrik Vieth in Metafont. 'concmath-otf.sty' is \
a replacement for the original 'concmath.sty' package to be \
used with LuaTeX or XeTeX engines."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78172"

RPM_NAME = "texlive-concmath-otf-2026.226.0.0.73svn78172-60.2.noarch.rpm"
RPM_HASH = "e2b6237c971fb8e35e3befcde329007053eb1a5082991da1723bcf3462cca5a23b771b47c4b75db759efb0b9c0944ea11caf53ac832ceb6e60b54181e5eb27ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concmath-otf.sty \
texlive-concmath-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-unicode-math.sty \
texlive \
texlive-concmath-otf-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
