SUMMARY = "Library to access the VHD image format"
DESCRIPTION = "Library to access the Virtual Hard Disk (VHD) image format. \
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
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libvhdi1-20260901-1.1.aarch64.rpm"
RPM_HASH = "867432bbe5c3392a6a8c683c9cbf9f7e9a3fbcfe02104436a94ce04fcd5bf628f2465fc05498a55304e68f294e2950ed2be478241ffc3665c02ae9bc7238f965"

RPROVIDES:${PN} += "libvhdi.so.1 \
libvhdi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfguid.so.1 \
libuna.so.1"

inherit rpm
