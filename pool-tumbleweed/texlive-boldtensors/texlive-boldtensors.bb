SUMMARY = "Bold latin and greek characters through simple prefix characters"
DESCRIPTION = "This package provides bold latin and greek characters within \
\\mathversion{normal}, by using ~ and ' as prefix characters."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-boldtensors-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "b1f8878ec97851ad4ac42405eea96e8a318b3c42457dc9a75268cac80c6445b2188c7cafcb0686297bcb80252ac679ed01df66dac94237167e47d1b3f0b64881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boldtensors.sty \
texlive-boldtensors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
font-bbold \
grep \
sed \
tex-bbold.map \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
