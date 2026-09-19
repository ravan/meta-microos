SUMMARY = "Tools to access Microsoft PST and OST files"
DESCRIPTION = "Tools to access the Personal Folder File (PFF) and the Offline Folder \
File (OFF) format. These are used in several file types: PAB \
(Personal Address Book), PST (Personal Storage Table) and OST \
(Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20231205"

RPM_NAME = "libpff-tools-20231205-2.30.aarch64.rpm"
RPM_HASH = "448001dbb6517cd0b0d5cbdeb46ce0ae05cd7922d517712f697821ffa16ae33922adb13e47970861b4885fa3c6a62fad7cb43208cc000beb315706c6d2daa6d0"

RPROVIDES:${PN} += "libpff-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfmapi.so.1 \
libfvalue.so.1 \
libpff.so.1 \
libpff1"

inherit rpm
