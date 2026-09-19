SUMMARY = "Interfaces for Python"
DESCRIPTION = "This package is intended to be independently reusable in any Python \
project. It is maintained by the Zope Toolkit project. \
 \
This package provides an implementation of object interfaces for Python. \
Interfaces are a mechanism for labeling objects as conforming to a given \
API or contract. So, this package can be considered as implementation of \
the Design By Contract methodology support in Python."
LICENSE = "ZPL-2.1"

PV = "8.6"

RPM_NAME = "python313-zope.interface-8.6-1.1.aarch64.rpm"
RPM_HASH = "fbda78bf5a793f35941e153ac6d9c0ca5d8bffe3d1ba3ffb85631f09264ca229911564ad10b7bb3616e84b87578ebab0c91968ea179454d0c079e538d502f0d7"

RPROVIDES:${PN} += "python3-zope.interface \
python3.13dist-zope.interface \
python313-zope.interface \
python3dist-zope.interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
