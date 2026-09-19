SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "python314-pycups-2.0.4-2.11.aarch64.rpm"
RPM_HASH = "42897a80c55d4d98094bd4d6db287939390b28419fe77bdf4c5ed7352b923271c13fddbf488d4972e08d1aefd9ba61f25a900dd4e76929f46f966d0b482a46fc"

RPROVIDES:${PN} += "python3.14dist-pycups \
python314-cups \
python314-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
