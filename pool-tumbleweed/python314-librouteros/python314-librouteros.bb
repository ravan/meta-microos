SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python314-librouteros-4.2.1-1.1.noarch.rpm"
RPM_HASH = "8f8da306164c68fde2d8de60813ed31c0571ee8d929b123057eb76089f45b8b29c69dd95de6efc78a83f8f24def4bb29a9194925c145068ac03079ad6cd9e4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-librouteros \
python314-librouteros \
python3dist-librouteros"

RDEPENDS:${PN} += "python-abi"

inherit rpm
