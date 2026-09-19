SUMMARY = "Babel support for Hungarian"
DESCRIPTION = "The package provides a language definition file that enables \
support of Hungarian with babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6asvn77586"

RPM_NAME = "texlive-babel-hungarian-2026.226.1.6asvn77586-60.2.noarch.rpm"
RPM_HASH = "2ffc5a724abc577c49eb70b7774784903c28d2ee27a274e36eed8b14be6df6c9f8dc8a2dd3696133a76a0793e031921ec739adb000382645a3d8c65a1d1f6192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magyar.ldf \
texlive-babel-hungarian"

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
