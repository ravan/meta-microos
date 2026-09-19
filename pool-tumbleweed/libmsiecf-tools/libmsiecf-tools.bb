SUMMARY = "Utilities to inspect MS Internet Explorer Cache Files"
DESCRIPTION = "Several tools for reading MS Internet Explorer Cache files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "libmsiecf-tools-20260525-1.11.aarch64.rpm"
RPM_HASH = "374ed1219cbee83b46a6609e6fab39ff8988096e92c980c5eed5935c0ce51d136c88bb44b4a0b6c3b1ed2185dae5e7bf60ad6bc6dc785b2b7064a183d5fd31cc"

RPROVIDES:${PN} += "libmsiecf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libmsiecf.so.1"

inherit rpm
