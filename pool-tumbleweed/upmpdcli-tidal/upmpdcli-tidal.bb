SUMMARY = "TIDAL media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to the TIDAL music streaming service. \
You will need to install the tidalapi Python3 module with pip3."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-tidal-1.9.17-1.5.noarch.rpm"
RPM_HASH = "6906f006ab2f273e60300f52255cb6d6e9531e79af071e6b0e397d0b805a2ccddba587fb703380227703656fcb66e3b9ff43e06c7d0914cf7a8be711668caddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-tidal"

RDEPENDS:${PN} += "/usr/bin/env \
python3-requests \
upmpdcli"

inherit rpm
