SUMMARY = "Library for accessing the Resilient File System (ReFS)"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs1-20210422-3.31.aarch64.rpm"
RPM_HASH = "db151ae45350773d843e80a148846d18b13ecac62bb3807e5588b3773a586f5b45e7674b08f6a7b635e574f2b1bddf721528e6f072cc102753e242e728f83bcc"

RPROVIDES:${PN} += "libfsrefs.so.1 \
libfsrefs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
