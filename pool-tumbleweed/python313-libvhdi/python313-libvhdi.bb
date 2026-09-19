SUMMARY = "Library and tools to access the VHD image format"
DESCRIPTION = "Library and tools to access the Virtual Hard Disk (VHD) image format. \
 \
Read-supported formats: \
 \
* VHD version 1 \
 \
Supported image types: \
 \
* Fixed-size hard disk image \
* Dynamic-size (or sparse) hard disk image \
* Differential (or differencing) hard disk image \
* Note that an undo disk image (.vud) is also a differential image"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "python313-libvhdi-20260901-1.1.aarch64.rpm"
RPM_HASH = "3e942a0e5d325dfd3cc1feee0a11a7b1b3f87af092d233d9a2b2e4802198d0259e932df574d4b8305878b1233462c04beb4ca3fa54a80a587a5602faafe2cec7"

RPROVIDES:${PN} += "python3-libvhdi \
python313-libvhdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvhdi.so.1 \
python-abi"

inherit rpm
