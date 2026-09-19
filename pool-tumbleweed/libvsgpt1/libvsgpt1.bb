SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260911"

RPM_NAME = "libvsgpt1-20260911-1.1.aarch64.rpm"
RPM_HASH = "f0364f9d613e60323667ce63aa7650b84f64b9673b44c44d1487b9a107215a318554a3ec82a2d73f3ad72415025bbdfa6a4808c4d53e369cb8537939a4ec5037"

RPROVIDES:${PN} += "libvsgpt.so.1 \
libvsgpt1"

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
libfdata.so.1"

inherit rpm
