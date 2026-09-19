SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.2"

RPM_NAME = "python314-pyfuse3-3.4.2-2.4.aarch64.rpm"
RPM_HASH = "4f8a7b3586b14745d81090186239b9a7b8e941d2769800704185fba94222cdc424d15d886f901e5eb73c9fc2fdb0ba1e0f8233d7ec9e284fa07fa5c2f2445cd3"

RPROVIDES:${PN} += "python3.14dist-pyfuse3 \
python314-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
python-abi \
python314-trio"

inherit rpm
