SUMMARY = "Tool to download, convert and install the Spotify for Linux package"
DESCRIPTION = "Spotify-easyrpm is a script which downloads the latest snap package \
from the snapcraft.io repository and converts it into an RPM for \
installation. \
 \
Automated updates are also supported and installed through the system \
update manager."
LICENSE = "GPL-3.0-only"

PV = "4.0.2"

RPM_NAME = "spotify-easyrpm-4.0.2-1.1.noarch.rpm"
RPM_HASH = "9fa55d587a8f6f674850d04d90cff63bc0cecb350d445ac4fd6becc8eeadc67221a09a2cc99844cf6af5427a1023054cf122fc76a5df204e44edb11ace71a511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spotify-easyrpm"

RDEPENDS:${PN} += "/usr/bin/bash \
createrepo-c \
curl \
jq \
openssl \
rpm-build \
rpmdevtools \
squashfs"

inherit rpm
