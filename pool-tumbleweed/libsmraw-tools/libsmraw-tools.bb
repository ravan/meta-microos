SUMMARY = "Utilities for reading and writing storage media (split) RAW files"
DESCRIPTION = "This subpackage contains the utility programs from libsmraw to \
acquire, export, query and verify storage media (split) RAW files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsmraw-tools-20260902-1.1.aarch64.rpm"
RPM_HASH = "c2c5d6616bc28dd0c31ef52e89ae16f0ecdb9f89c7dc414ef17ee571ebfb8512c7ea46e6194765ee49a63ef6f89964cfb302a8a1a330cbc593b7db67e5395601"

RPROVIDES:${PN} += "libsmraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libfuse3.so.4 \
libhmac.so.1 \
libsmraw.so.1"

inherit rpm
