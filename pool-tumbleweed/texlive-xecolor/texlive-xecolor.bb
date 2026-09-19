SUMMARY = "Support for color in XeLaTeX"
DESCRIPTION = "This is a simple package which defines about 140 different \
colours using XeTeX's colour feature. The colours can be used \
in bidirectional texts without any problem."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-xecolor-2026.226.0.0.1svn77682-59.4.noarch.rpm"
RPM_HASH = "c3d957d504f979f648fc6cbd9a85da9a29fa17943adc2c2ad8136e5e3ffa1808ac69e4a24cb4c5ef3e56c4ab56da590e6550600c4d0fed46c84b4d767188e5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecolor.sty \
texlive-xecolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
