SUMMARY = "Severed fonts for texlive-fge"
DESCRIPTION = "The  separated fonts package for texlive-fge"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.25svn77682"

RPM_NAME = "texlive-fge-fonts-2026.226.1.25svn77682-59.2.noarch.rpm"
RPM_HASH = "0c552feef1d8e1b06d309558f1c2a5a40b561044b436d1fd087dc8671e7d350c2c2e1143890d1472164be9096765ef0f54de5643f210d45e784ecdc150e3c18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-fgeit10 \
font-fgerm10 \
texlive-fge-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
