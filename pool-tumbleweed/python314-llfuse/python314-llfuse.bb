SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.2"

RPM_NAME = "python314-llfuse-1.5.2-1.6.aarch64.rpm"
RPM_HASH = "1a9f185df2285b3dfe98b379dff12ba1c1a1b4c100a233edfe6a2186f0c073f6b1725e1a5beecb0f7eb5f3435d6cb8fc07e0dbe759064d79fcdbecbbe2932d52"

RPROVIDES:${PN} += "python3.14dist-llfuse \
python314-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
