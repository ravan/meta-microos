SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "2.1.0"

RPM_NAME = "python314-pywebpush-2.1.0-1.4.noarch.rpm"
RPM_HASH = "96e46e363c89c3d173f59cd7131c542434a60f30c825382fd13b27d1b5b251dae15d5d64562cecbe8dd4d256ae2f810f4726dc27d36c6f5b166fc15b775b57ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pywebpush \
python314-pywebpush \
python3dist-pywebpush"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-aiohttp \
python314-cryptography \
python314-http-ece \
python314-py-vapid \
python314-requests \
update-alternatives"

inherit rpm
