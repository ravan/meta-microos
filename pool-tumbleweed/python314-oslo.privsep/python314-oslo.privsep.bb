SUMMARY = "OpenStack library for privilege separation"
DESCRIPTION = "OpenStack library for privilege separation"
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "python314-oslo.privsep-3.12.0-1.1.noarch.rpm"
RPM_HASH = "a3dd007bde1f10db642ffccbe6be7bd5d6c078ecd0d6efe92144b44ec91c754e584ce0ace5f4a197b4ab6458d2659caef82f8e9c88998ee204161ea1a2562887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.privsep \
python314-oslo.privsep \
python3dist-oslo.privsep"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cffi \
python314-eventlet \
python314-greenlet \
python314-msgpack \
python314-oslo.config \
python314-oslo.i18n \
python314-oslo.log \
python314-oslo.utils"

inherit rpm
