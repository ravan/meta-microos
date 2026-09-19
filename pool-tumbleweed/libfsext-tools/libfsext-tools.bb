SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20260821"

RPM_NAME = "libfsext-tools-20260821-1.1.aarch64.rpm"
RPM_HASH = "44de22c50ce4f04c05b63ed07b6b29737ea37eb7d04949681e170879b10a002a69f25358211eef6570a5e8f6e961ade51e9cecc1b413a16b63547363fe9b66f3"

RPROVIDES:${PN} += "libfsext-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsext.so.1 \
libfsext1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
