SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python313-pychm-0.8.6-3.7.aarch64.rpm"
RPM_HASH = "198f276817b9b0e7ca01fee6e5d9eb129b579a39daf17390ce685b18ada845b934cf87a66e6f7a61d4270424c8d36983885b81a416c53593d6f2ab2c355cc62c"

RPROVIDES:${PN} += "python3-pychm \
python3.13dist-pychm \
python313-pychm \
python3dist-pychm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
python-abi"

inherit rpm
