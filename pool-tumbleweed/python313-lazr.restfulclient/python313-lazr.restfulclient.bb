SUMMARY = "Programmable client library to provide added functionality on top of wadllib"
DESCRIPTION = "A programmable client library that takes advantage of the commonalities among lazr.restful \
web services to provide added functionality on top of wadllib."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.6"

RPM_NAME = "python313-lazr.restfulclient-0.14.6-1.3.noarch.rpm"
RPM_HASH = "270533872c33796bbdf644c877779e43ecf7e94cd9df177bd02ae5002531d3bdb01797e74c3ba8f511f911d847b588b76f3f91109877727beef1264b55c1a5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.restfulclient \
python3.13dist-lazr.restfulclient \
python313-lazr.restfulclient \
python3dist-lazr.restfulclient"

RDEPENDS:${PN} += "python-abi \
python313-distro \
python313-httplib2 \
python313-oauthlib \
python313-setuptools \
python313-six \
python313-wadllib"

inherit rpm
