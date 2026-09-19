SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-base58-2.1.1-3.5.noarch.rpm"
RPM_HASH = "1d7cc6bd5c8c8996b23fc8635ebe8d085af872cc754ab0d6237978cff0eb14a0b4031e4649e954ccea85857c3745c73ab5ef64ecb8546617852121eb97fee4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-base58 \
python3.13dist-base58 \
python313-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
