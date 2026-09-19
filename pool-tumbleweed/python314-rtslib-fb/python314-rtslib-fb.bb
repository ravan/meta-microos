SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.2.2"

RPM_NAME = "python314-rtslib-fb-2.2.2-3.6.noarch.rpm"
RPM_HASH = "94bf014195b89c2d49be796924beaaa12e489fc745d167b3326bdb21a78f6b2efe37d387f470253122d10421d584b22eab21b83eb1a13f71d6c1b173e26f516d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rtslib-fb \
python314-rtslib \
python314-rtslib-fb \
python3dist-rtslib-fb"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python-rtslib-fb-common \
python314-pyudev"

inherit rpm
