SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "python314-mygpoclient-1.10-1.5.noarch.rpm"
RPM_HASH = "d77dac148e98d3f4b60de7f98da8bf77745d2fa76d3ad378c645ab2ead50979bc229605c06bd01f4fb0ba866a380b45b72a5290181eb6ecce7dc522e70e5eef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mygpoclient \
python314-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-simplejson \
update-alternatives"

inherit rpm
