SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260903"

RPM_NAME = "python313-libbde-20260903-1.2.aarch64.rpm"
RPM_HASH = "7fa2b7ef26ac6283812437ad34a705d9af90ea7ee5e37e80cb3f720e16f927365bb6837d75457d069df2618db13090ec7b6bb11c7bec3d2ff3bc4cc5be8e8738"

RPROVIDES:${PN} += "python3-libbde \
python313-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm
