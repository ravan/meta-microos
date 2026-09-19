SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.19.1"

RPM_NAME = "python313-netutils-1.19.1-1.1.noarch.rpm"
RPM_HASH = "34be994ed950a7f3fbc2849d176b5bcd3c6e36f2780ed461ac507127f73ef53b3a11e8a1e49bb21e261fb86918c7e6fd2d26e9fae2087541cd95f3e37c2115c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netutils \
python3.13dist-netutils \
python313-netutils \
python3dist-netutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
