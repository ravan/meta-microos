SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.4"

RPM_NAME = "python313-py-vapid-1.9.4-1.4.noarch.rpm"
RPM_HASH = "62af93297f1312975155cf31e130a4de0a5037d9de043444917714810c9131e7f0683c4b95215b8c9897cf69c2220f4ba9029539a632feb1f5524f1a74132f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-vapid \
python3.13dist-py-vapid \
python313-py-vapid \
python3dist-py-vapid"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cryptography"

inherit rpm
