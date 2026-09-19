SUMMARY = "BBC radio media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to BBC radio streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-bbc-1.9.17-1.5.noarch.rpm"
RPM_HASH = "66c9a8bbdae04ea2a279ef8a5fb7d35491b61c0fc71ac78054ee1896fff6a28c519422ab577aacb7694c190be06e2e79b10440212584c459111dfc62a51f1ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-bbc"

RDEPENDS:${PN} += "/usr/bin/env \
python3-beautifulsoup4 \
python3-dateutil \
python3-feedparser \
upmpdcli"

inherit rpm
