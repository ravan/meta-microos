SUMMARY = "Python 3 libraries for the RADOS block device"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
block device."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "python3-rbd-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "5bc2eb44c49c143e34e02350d82d3b7aa9b913ba5ed6a9d3ab2e4fba629f1634542c4f6b1143c33516761b41fece52359d129a510f00abdb65723a3dbb186eff"

RPROVIDES:${PN} += "python-rbd \
python3-rbd \
python3.13dist-rbd \
python3dist-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librbd.so.1 \
librbd1 \
python-abi \
python3-rados"

inherit rpm
