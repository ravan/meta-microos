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

RPM_NAME = "python314-libvhdi-20260901-1.1.aarch64.rpm"
RPM_HASH = "6fa2521f868805ef4aee51ff58247a8538e6d59273c468e31c7db984baf1640bbd1312de9d48b26f6e45568fe66b76c8bb1bb82daf89e4261b647df892e0e195"

RPROVIDES:${PN} += "python314-libvhdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvhdi.so.1 \
python-abi"

inherit rpm
