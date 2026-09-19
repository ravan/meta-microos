SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python313-importlab-0.8.1-2.5.noarch.rpm"
RPM_HASH = "e2127e0d51d88aed0d89b82dbafcee8bbea3262fc10426060eb777de2d0f75de26fefe89967d8d6e1e01f863e5f462d39ecd32b2b67292effaf5d42eaf5a2b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlab \
python3.13dist-importlab \
python313-importlab \
python3dist-importlab"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-networkx"

inherit rpm
