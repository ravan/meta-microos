SUMMARY = "Library to access the VMDK image format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
Read supported extent file formats: \
 \
* RAW (flat) \
* COWD version 1 (sparse) \
* VMDK version 1, 2 and 3 (sparse) \
 \
Supported VMDK format features: \
 \
* delta links \
* grain compression \
* data markers \
 \
VMDK format features not supported at the moment: \
 \
* images that use a physical device \
* changed block tracking (CBT) (supported by VMDK version 3 (sparse)) / change tracking files"
LICENSE = "LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "libvmdk1-20260714-1.2.aarch64.rpm"
RPM_HASH = "26835e8983acbe0a74d9173c93e50b0bf119b4abb20059d43382ace737914fec9e19e3b1110c20693d4fbbb85c7573c9c0d263711707832327cf09afb0ec57ab"

RPROVIDES:${PN} += "libvmdk.so.1 \
libvmdk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
