SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.4"

RPM_NAME = "python314-py-vapid-1.9.4-1.4.noarch.rpm"
RPM_HASH = "7e7248faf3ca51665fb415e273041a8db3870cb94c9a6e08852a6ad0b236a7d305b9508616622004d662224f9f671e0cd38acdea81e9b5f19bda9117dd789328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-vapid \
python314-py-vapid \
python3dist-py-vapid"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cryptography"

inherit rpm
