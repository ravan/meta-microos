SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.2"

RPM_NAME = "python313-kasa-0.10.2-1.4.noarch.rpm"
RPM_HASH = "23502d811aa8b1d9281bfcd0348eccd826fbcb567af107ba61c05f3e212601d317582c5038c5783d7bc6ddb2f009ca058eb7e824e4b94999b8842efd99b4a904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kasa \
python3.13dist-python-kasa \
python313-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-aiohttp \
python313-asyncclick \
python313-cryptography \
python313-mashumaro \
python313-setuptools \
update-alternatives"

inherit rpm
