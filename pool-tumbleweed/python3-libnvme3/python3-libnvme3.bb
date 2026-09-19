SUMMARY = "Python binding for nvme-cli"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "python3-libnvme3-3.0+6.g1ac60ca4b-1.1.aarch64.rpm"
RPM_HASH = "3e571f06ab6cf6b877b3fc01770e6bc9c92d418b053cfec4f2788fe8fe2c42b4c570650b2a93f147b84fa5ee62fc1ddab4c4338ff274de12d4340c3118f420a9"

RPROVIDES:${PN} += "python3-libnvme3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnvme3-1 \
libnvme3.so.1 \
python-abi"

inherit rpm
