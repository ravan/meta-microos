SUMMARY = "Block IO tracer"
DESCRIPTION = "blktrace is a block layer IO tracing mechanism which provides detailed \
information about request queue operations up to user space. This is \
valuable for diagnosing and fixing performance or application problems \
relating to block layer io."
LICENSE = "GPL-2.0-only"

PV = "1.3.0+git.20250320"

RPM_NAME = "blktrace-1.3.0+git.20250320-1.7.aarch64.rpm"
RPM_HASH = "80b47b81f7bc058ea59d6e443e404b53e6c21b51fa73fe5cf56fde8e61cfb2011ba784d53a2c624dfc0acc6e436403c1c4e95e21c6cdde2b5297e7627eb786d1"

RPROVIDES:${PN} += "blktrace"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
