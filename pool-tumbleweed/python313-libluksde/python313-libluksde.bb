SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python313-libluksde-20260902-1.2.aarch64.rpm"
RPM_HASH = "f3d517df3218f3e18e00ed39695648007c41924303de37f59c95d6966c8383f7b61933af111ab0701a29790561b128752692e5606d5aa8fe694862c2e0787429"

RPROVIDES:${PN} += "python3-libluksde \
python313-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
