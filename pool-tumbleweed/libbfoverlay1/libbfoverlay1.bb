SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libbfoverlay is a library to provide basic file overlay support. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libbfoverlay1-20240505-2.16.aarch64.rpm"
RPM_HASH = "62787f537d09ccac14af8e72106a0606d1ba698c3713a869857f6e4a2881af7858d93e35d6b54db6bf5ebf43ec5be6cc179f2481a1e77592adc2c218da0eb1c1"

RPROVIDES:${PN} += "libbfoverlay.so.1 \
libbfoverlay1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfvalue.so.1"

inherit rpm
