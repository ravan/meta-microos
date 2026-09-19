SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python313-pygerrit2-2.0.15-2.5.noarch.rpm"
RPM_HASH = "f71b9e01c5d8ab52429124fbf64ee824ac63d9ecfdb7ac0616786a963b19bf295685ac7eb8c5787d507bb342a3c04d574da7305b1cf73c68f1c9f5b4d4024a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygerrit2 \
python3.13dist-pygerrit2 \
python313-pygerrit2 \
python3dist-pygerrit2"

RDEPENDS:${PN} += "python-abi \
python313-pbr \
python313-requests"

inherit rpm
