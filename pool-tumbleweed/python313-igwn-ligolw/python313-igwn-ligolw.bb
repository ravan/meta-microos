SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "This module provides a python LIGO Light-Weight XML I/O Library"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python313-igwn-ligolw-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "b07becbd00e0cc40efc42fde81e3c9e31add51401f782e4c196e891c600888676ed510d1309a12e64833793a43f0d147ef381dd1e99a60888f02e80c37389e95"

RPROVIDES:${PN} += "python3-igwn-ligolw \
python3.13dist-igwn-ligolw \
python313-igwn-ligolw \
python3dist-igwn-ligolw"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-PyYAML \
python313-igwn-segments \
python313-numpy \
python313-python-dateutil \
python313-tqdm"

inherit rpm
