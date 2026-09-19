SUMMARY = "Command line wrapper for pyright"
DESCRIPTION = "Command line wrapper for pyright"
LICENSE = "MIT"

PV = "1.1.411"

RPM_NAME = "python313-pyright-1.1.411-3.1.noarch.rpm"
RPM_HASH = "21e9dca4ee26ad34a2c5a98d99249c10310f4b68ded499ce567ef5b28ae1cf26889f0f7f4d8d2f275bd785f31b3be37191e7e6d30adb35fc7f321a4feac9e7e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyright \
python3.13dist-pyright \
python313-pyright \
python3dist-pyright"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
nodejs \
nodejs-common \
python-abi"

inherit rpm
