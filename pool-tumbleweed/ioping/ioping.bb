SUMMARY = "A tool to monitor I/O latency in real time"
DESCRIPTION = "A tool to monitor I/O latency in real time. It shows disk latency in the \
same way as ping shows network latency."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "ioping-1.3-1.12.aarch64.rpm"
RPM_HASH = "c647f01902443aedd7954259a17d24591c7bfbe2842e2119029565fc63ea8bc5495d5cd05d1fab751bca1949b64e2052429333e1a7723c8d0104f7ea3336e475"

RPROVIDES:${PN} += "ioping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
