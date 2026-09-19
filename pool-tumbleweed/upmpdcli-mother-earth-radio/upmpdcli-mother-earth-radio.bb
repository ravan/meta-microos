SUMMARY = "Mother Earth Radio media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to Mother Earth Radio streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-mother-earth-radio-1.9.17-1.5.noarch.rpm"
RPM_HASH = "867e2bfc7897cc0c716bc813a3252aaa52a4f31285a4ae3f5c4271dbd5d6c86ec813298f851bfc79a2446cec10451c8368b546a4d2ba7c814b09b89ca5a3d191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-mother-earth-radio"

RDEPENDS:${PN} += "/usr/bin/env \
python3-requests \
upmpdcli"

inherit rpm
