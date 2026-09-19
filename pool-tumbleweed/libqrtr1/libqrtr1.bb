SUMMARY = "Qualcomm IPC Router shared library"
DESCRIPTION = "Userspace shared library of Qualcomm IPC Router (QRTR)"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "libqrtr1-1.0-1.10.aarch64.rpm"
RPM_HASH = "01920d94470dc4696a6576e1edb17f48a3e15d8393a4691be9497bf47d2258f1f1db34c36bf386f2f1778cfb598762f93c1f2c58f5c40d208cc5b7dd853d1c8a"

RPROVIDES:${PN} += "libqrtr.so.1 \
libqrtr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
