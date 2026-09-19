SUMMARY = "An IBus engine for users of the Cangjie and Quick input methods"
DESCRIPTION = "IBus engine for users of the Cangjie and Quick input methods. \
It is primarily intended to Hong Kong people who want to input Traditional Chinese, as they are (by far) the majority of Cangjie and Quick users. However, it should work for others as well (e.g to input Simplified Chinese)."
LICENSE = "GPL-3.0-only"

PV = "2.5"

RPM_NAME = "ibus-cangjie-2.5-2.4.noarch.rpm"
RPM_HASH = "9f82afa16d273e217f6a6776a1459ee710f23fb0abeadf6a9a3dfa2836181e35f96f9c3a06cfc0a5bf5342703de575e7b2b8c04c6f3255b8b546a70d367240e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-cangjie"

RDEPENDS:${PN} += "/usr/bin/python3 \
ibus \
python-abi \
python3 \
python3-cangjie \
python3-gobject"

inherit rpm
