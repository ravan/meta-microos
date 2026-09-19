SUMMARY = "Python3 bindings for the LDB library"
DESCRIPTION = "This package contains the python3 bindings for the LDB library."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "python3-ldb-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "e7b60a8e98d9223bb7ea27406bd2c9b75481b40118d2c75f29951e6463cffd0f41ce7211328fcf9ccfdcc62989800c89384ebc603d8a4e0999170fd2bc71f2cb"

RPROVIDES:${PN} += "libpyldb-util.cpython-313-aarch64-linux-gnu-private-samba.so \
python3-ldb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libldb2 \
libpython3.13.so.1.0 \
libtalloc.so.2 \
python-abi"

inherit rpm
