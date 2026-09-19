SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260903"

RPM_NAME = "python314-libbde-20260903-1.2.aarch64.rpm"
RPM_HASH = "08111d22124783fde7eb0937e13c9f905adb51576430b5a14e04e88c02ed77a07c060990a112960b0bcefdfcd0c9b08f3bdf3c7e9f20b70281b12b6bd392daef"

RPROVIDES:${PN} += "python314-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm
