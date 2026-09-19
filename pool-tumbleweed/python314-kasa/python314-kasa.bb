SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.2"

RPM_NAME = "python314-kasa-0.10.2-1.4.noarch.rpm"
RPM_HASH = "0832da2750d077afa607ffe84b9605084396f2a4059389865796d4f927492ec7c01cf356ef91f1175f3a3f8533eef500b9f01cbf9751686f0a86ec2a464f8ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-kasa \
python314-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-aiohttp \
python314-asyncclick \
python314-cryptography \
python314-mashumaro \
python314-setuptools \
update-alternatives"

inherit rpm
