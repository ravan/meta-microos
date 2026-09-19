SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.2"

RPM_NAME = "python313-llfuse-1.5.2-1.6.aarch64.rpm"
RPM_HASH = "65158455643fc6559e8d78e0a05a0a0a56e91985d138a743af3a47a7e864a5943b158627af23a8a2fbd1db93f98732fb5bb85f208f64eca80c5d5d3d5976ef0a"

RPROVIDES:${PN} += "python3-llfuse \
python3.13dist-llfuse \
python313-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
