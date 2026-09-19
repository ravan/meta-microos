SUMMARY = "Recoll media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to Recoll indexed media. \
For use with recoll package found in KDE:Extra"
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-uprcl-1.9.17-1.5.noarch.rpm"
RPM_HASH = "3f4526eb42d5c01ea40f26b04b055dd45be6eb2aa97a51850fe86ba14b6611e38fe003eae30f66fee34a1dc1a9ab08b63fc832608da41c57e6dc8f25d9f926ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-uprcl"

RDEPENDS:${PN} += "/usr/bin/env \
python3-mutagen \
python3-requests \
python3-waitress \
upmpdcli"

inherit rpm
