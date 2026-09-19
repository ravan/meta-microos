SUMMARY = "Media server plugin for upmpdcli for https://radio-browser.info"
DESCRIPTION = "Media Server plugin providing access to the radio-browser site catalog \
(https://radio-browser.info) \
You will need to install the pyradios Python3 module with pip3."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-radio-browser-1.9.17-1.5.noarch.rpm"
RPM_HASH = "dbc2a92b35d0e7d05a9c72798aa34623778a3a341d12d9fb564c590728e86cd379a156faceb351c70e375d4f4d3bef1fe5d9b2282e553e8c4f5dd00799cd499a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-radio-browser"

RDEPENDS:${PN} += "/usr/bin/env \
python3-requests \
upmpdcli"

inherit rpm
