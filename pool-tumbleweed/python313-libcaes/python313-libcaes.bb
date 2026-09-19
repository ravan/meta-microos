SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20260905"

RPM_NAME = "python313-libcaes-20260905-1.1.aarch64.rpm"
RPM_HASH = "4ada6fe00a22334f874ac624edb1623b0b86a917af0117f11db75e47aa403d3f3f28b188bf611b4ec3ec4a4106e3cabbe8d4db2188e7ec2e34182565a50548b3"

RPROVIDES:${PN} += "python3-libcaes \
python313-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
