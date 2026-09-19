SUMMARY = "An implementation of the colorbrewer2.org colours for MetaPost"
DESCRIPTION = "This package provides two MetaPost include files that define \
all the colorbrewer2.org colours: colorbrewer-cmyk.mp \
colorbrewer-rgb.mp The first defines all the colours as CMYK, \
the second as RGB. Use whichever one you prefer. For an example \
of what you can do, and a list of all the names, have a look at \
colorbrewer-sampler.mp. You can also see the names on \
http://colorbrewer2.org. The package also includes the Python \
script used to generate the MP source from the colorbrewer \
project."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn48753"

RPM_NAME = "texlive-metapost-colorbrewer-2026.226.svn48753-61.2.noarch.rpm"
RPM_HASH = "7f22218a8ceed51979f5e0b4b1302e6e82e69ced8d55ac7f1eeccf0dc9a2976b50097a9c6b209ff49afe59cfdb862f778364dc0db777d664bb831aa42de34107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-colorbrewer"

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
