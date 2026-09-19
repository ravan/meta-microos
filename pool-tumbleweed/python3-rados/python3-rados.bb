SUMMARY = "Python 3 libraries for the RADOS object store"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
object store."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "python3-rados-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "2b8fd3833d35e56ceaf6d0a3ac3d84cd84a898726861d722574677f00f411083e70723adb555fe652dcef4c902be7458c2027da05e04d451cff58b5adb9b0e34"

RPROVIDES:${PN} += "python-rados \
python3-rados \
python3.13dist-rados \
python3dist-rados"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librados2 \
python-abi \
python3"

inherit rpm
