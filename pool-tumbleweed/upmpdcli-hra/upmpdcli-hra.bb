SUMMARY = "HIGHRESAUDIO media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to the HIGHRESAUDIO \
music streaming service (https://www.highresaudio.com/en)."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-hra-1.9.17-1.5.noarch.rpm"
RPM_HASH = "609342e12afbb961033e2e9a2c4dc69a17b22b54f2f4a18bafc7d85ae0be9288122addacf7ca056550a4c8d3bae361fbc17b0ad4e17770b68f39fd708c23660c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-hra"

RDEPENDS:${PN} += "/usr/bin/env \
python3-requests \
upmpdcli"

inherit rpm
