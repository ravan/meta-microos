SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python313-mobi-0.3.3-4.2.noarch.rpm"
RPM_HASH = "8fad79cb0f9ca367c7371bd8997a787f053488c024da8c5e937e7f794282c59366dd6ceb03c05d8c6218e5e157462716ea43ad9e0a25bfe58cd5afa1c0f39b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mobi \
python3.13dist-mobi \
python313-mobi \
python3dist-mobi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-loguru"

inherit rpm
