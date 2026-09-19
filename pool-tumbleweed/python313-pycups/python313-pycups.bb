SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "python313-pycups-2.0.4-2.11.aarch64.rpm"
RPM_HASH = "46e46f3cc21cf25766eb80a41525ee24d80c91453249af8eea5b7c301038bf357e7552b461a56fd3aabb43c00c1ccfc7ed96f690954f4823d6a3f73f7323b133"

RPROVIDES:${PN} += "python3-cups \
python3-pycups \
python3.13dist-pycups \
python313-cups \
python313-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
