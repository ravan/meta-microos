SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "This module provides a python LIGO Light-Weight XML I/O Library"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python314-igwn-ligolw-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "53998da76c5ea92fbae87f555c32c8bbb71536a6d299e938b2e4e4b6ee0c543056570ba8f74cd7d81db913d8e52bb38ae51600a95804b932724b521690fb19f1"

RPROVIDES:${PN} += "python3.14dist-igwn-ligolw \
python314-igwn-ligolw \
python3dist-igwn-ligolw"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-PyYAML \
python314-igwn-segments \
python314-numpy \
python314-python-dateutil \
python314-tqdm"

inherit rpm
