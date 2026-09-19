SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.2"

RPM_NAME = "python313-pyfuse3-3.4.2-2.4.aarch64.rpm"
RPM_HASH = "cdb3349754c78235e2f9725ba98a039bf19730086f4217a7294efb4c380d5ef36f74d79df40777a3c8a969e9ea1103bd9a3e935d8d78d6bc04f24cdca9a0e8b4"

RPROVIDES:${PN} += "python3-pyfuse3 \
python3.13dist-pyfuse3 \
python313-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
python-abi \
python313-trio"

inherit rpm
