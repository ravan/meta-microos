SUMMARY = "Programmable client library to provide added functionality on top of wadllib"
DESCRIPTION = "A programmable client library that takes advantage of the commonalities among lazr.restful \
web services to provide added functionality on top of wadllib."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.6"

RPM_NAME = "python314-lazr.restfulclient-0.14.6-1.3.noarch.rpm"
RPM_HASH = "a11db2689e6c497fd80daa7204ebb6736764f5e84afc37cf2bc91fe137f016ae56238320b8c56fc160300699cd854db9f67e00d853c4b7897b9c72fd034a01f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazr.restfulclient \
python314-lazr.restfulclient \
python3dist-lazr.restfulclient"

RDEPENDS:${PN} += "python-abi \
python314-distro \
python314-httplib2 \
python314-oauthlib \
python314-setuptools \
python314-six \
python314-wadllib"

inherit rpm
