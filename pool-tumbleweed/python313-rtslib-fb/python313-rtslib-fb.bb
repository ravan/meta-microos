SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.2.2"

RPM_NAME = "python313-rtslib-fb-2.2.2-3.6.noarch.rpm"
RPM_HASH = "1202667bd212329353e4d2158f6e651b1a6890993a1f217cc9e0d683fb8a623b1f28047a7c2309c4d5658392586088b9fa3bd4f2583ba3dff6bfced2cf0d57ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rtslib \
python3-rtslib-fb \
python3.13dist-rtslib-fb \
python313-rtslib \
python313-rtslib-fb \
python3dist-rtslib-fb"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python-rtslib-fb-common \
python313-pyudev"

inherit rpm
