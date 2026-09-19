SUMMARY = "Drawing artificial neural networks with MetaPost and METAOBJ"
DESCRIPTION = "This MetaPost package allows to draw artificial neural \
networks. It is based on the METAOBJ package which provides \
many tools to draw and arrange nodes. This package is in beta \
version -- do not hesitate to report bugs, as well as requests \
for improvement."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn73627"

RPM_NAME = "texlive-mp-neuralnetwork-2026.226.0.0.1svn73627-61.2.noarch.rpm"
RPM_HASH = "a5b5fe7182ce04bd03fa8eb306ebb0cd4d2c54d7299bf747df69a02cff7dd4d916b2eb14735a0cba91bcd79a811329de0e55556b7e6987f865755ff32aaa5a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mp-neuralnetwork"

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
