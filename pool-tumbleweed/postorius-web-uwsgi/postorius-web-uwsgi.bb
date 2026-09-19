SUMMARY = "Postorius - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "postorius-web-uwsgi-1.3.13-8.1.noarch.rpm"
RPM_HASH = "f098c2c5f375a3fb5f0d39d72341dd28e7e087027e78117d04d0901e2ed4d1f9788122747c9902f07d4705b9d4b1b291fc1af92e69d34deb308a738ad4e3ad9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postorius-web-uwsgi \
postorius-web-uwsgi"

RDEPENDS:${PN} += "postorius-web \
python313-uwsgi-python3"

inherit rpm
