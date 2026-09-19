SUMMARY = "Flexible python implementation of red black trees"
DESCRIPTION = "Flexible python implementation of red black trees"
LICENSE = "MIT"

PV = "1.22"

RPM_NAME = "python314-red-black-tree-mod-1.22-2.9.noarch.rpm"
RPM_HASH = "d0dd2f930c7cbe95b58b04e61572d85c1fdfb499ef5dc781def7511734dc52919e6411062a3f5686f5517498894535ffd9a508e02ddece1baabe7d8d0771dab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-red-black-tree-mod \
python314-red-black-tree-mod \
python3dist-red-black-tree-mod"

RDEPENDS:${PN} += "python-abi"

inherit rpm
