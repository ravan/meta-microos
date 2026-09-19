SUMMARY = "Python binding for libnvme"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.2"

RPM_NAME = "python3-libnvme-1.16.2-1.3.aarch64.rpm"
RPM_HASH = "601547b898ce284ba4aa9bc3f40d50687c712659ade1a3494cc90c2cfd477d824269a21925deea509811127d679ec6c5f9b1c857c499a731dc9104d2982afc79"

RPROVIDES:${PN} += "python3-libnvme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnvme.so.1 \
python-abi"

inherit rpm
