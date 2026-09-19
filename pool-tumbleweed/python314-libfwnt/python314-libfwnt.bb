SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "python314-libfwnt-20260602-1.5.aarch64.rpm"
RPM_HASH = "ef4d19c90dad17b4884dc733a72b5d5c5c6d938449595535be44ecfda23d775f8c8ce8b2ec1702b9dc0afdb564b670e08d58750dd7c2150bcb4eb773a6770e85"

RPROVIDES:${PN} += "python314-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
