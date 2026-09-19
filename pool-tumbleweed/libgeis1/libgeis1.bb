SUMMARY = "Gesture engine interface and support"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "libgeis1-2.2.17-5.10.aarch64.rpm"
RPM_HASH = "481ce2dc88ef7b5604bb968cd24c8d24f1cfc85167ea1957fdd063a2167de1a216f9163f9de0988dee3b3ec40bbff84f80008d30cf5fae3e5b6a1531ca96c10f"

RPROVIDES:${PN} += "libgeis.so.1 \
libgeis1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libframe.so.6 \
libgrail.so.6 \
libm.so.6"

inherit rpm
