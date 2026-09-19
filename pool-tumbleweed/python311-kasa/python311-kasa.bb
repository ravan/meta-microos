SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.2"

RPM_NAME = "python311-kasa-0.10.2-1.2.noarch.rpm"
RPM_HASH = "4a98ad4f917dcf040ea81ba1e5296b2568260285f78ad67d3f5c1f22b5fba772e7fbe42d48bd5efa23ae62558a76e9dd09c0cb7ad3aadcafdf4273d9cc2d6855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-kasa \
python311-kasa \
python3dist-python-kasa"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-asyncclick \
python311-cryptography \
python311-mashumaro \
python311-setuptools \
update-alternatives"

inherit rpm
