SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-colorlover-0.3.0-2.5.noarch.rpm"
RPM_HASH = "56ef3ee78d4c3e7bd193eccbc5544f206d0937d3f8d70e1a11353c5ffe58a50f8c0159dabfec432e949c91a233893662584ee14751a2db9a977522c2472054f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colorlover \
python314-colorlover \
python3dist-colorlover"

RDEPENDS:${PN} += "python-abi"

inherit rpm
