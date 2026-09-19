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

RPM_NAME = "python314-zope.interface-8.6-1.1.aarch64.rpm"
RPM_HASH = "5fff58183066640bcfbec05e5eadfebcf2826490ef5ab7c5b02d3973b3b7fa1ed8607fd05fe624359451982974681dbdb4b172d055a7b659166cf607f2c843b3"

RPROVIDES:${PN} += "python3.14dist-zope.interface \
python314-zope.interface \
python3dist-zope.interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
