SUMMARY = "A pass extension for importing data from most of the existing password manager"
DESCRIPTION = "A pass extension for importing data from most of the existing password manager."
LICENSE = "GPL-3.0-only"

PV = "3.5"

RPM_NAME = "pass-import-3.5-2.7.noarch.rpm"
RPM_HASH = "f2835847a197abad2c21440ccc42b3151b62c255e7daf0bd312b328ad8d386953f4bc11d4c0a60a8d054f23eab2756c16d4c75cbbf15e6036d787e019756d443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pass-import \
python3.13dist-pass-import \
python3dist-pass-import"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-requests \
python3-zxcvbn"

inherit rpm
