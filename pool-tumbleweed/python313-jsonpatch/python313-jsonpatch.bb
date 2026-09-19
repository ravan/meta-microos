SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.33"

RPM_NAME = "python313-jsonpatch-1.33-2.5.noarch.rpm"
RPM_HASH = "6c8608393cf8bcb78efd18ad9d0e0614e7e81d20878cfac7c97bfe7c0d78f1ca288c8bb61f2be492700824a931c7ee7a2ccea6a7415bff73c1a0bf0c963f8ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpatch \
python3.13dist-jsonpatch \
python313-jsonpatch \
python3dist-jsonpatch"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-jsonpointer"

inherit rpm
