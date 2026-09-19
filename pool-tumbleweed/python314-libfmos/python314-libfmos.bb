SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20260520"

RPM_NAME = "python314-libfmos-20260520-1.8.aarch64.rpm"
RPM_HASH = "812c2c3388cb37ad5ba0cd36ff6ba81c12d4eff015e243db5b73092bdf8576def68646c8e7cb7c30bd093c676bcf6c293d366e02a3dcb7dec4a2b770f7ae27ac"

RPROVIDES:${PN} += "python314-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
