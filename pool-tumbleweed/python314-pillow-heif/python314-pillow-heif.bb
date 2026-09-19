SUMMARY = "Python interface for libheif library"
DESCRIPTION = "Python interface for libheif library"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python314-pillow-heif-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "e3e93992a1d086c83a3e3dc40a52253bbf0c7adbcf9fda5d1d9b7b036bece84241a9bba44dcc616f2df441b6aef5713365693ea84053182dd680448bbe31183e"

RPROVIDES:${PN} += "python3.14dist-pillow-heif \
python314-pillow-heif \
python3dist-pillow-heif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
python-abi \
python314-Pillow"

inherit rpm
