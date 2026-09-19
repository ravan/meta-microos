SUMMARY = "Tools to scan for binary signatures"
DESCRIPTION = "Tools to scan binary files for signatures."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsigscan-tools-20260902-1.1.aarch64.rpm"
RPM_HASH = "c627ffdfc13691bb47359c5452c44ebf6f7bb0090e0eb05ffaa32c4037136bb08d1699aabd4314f700d7da8e1c89ad7464fa14646f257a48f642294f99ba032a"

RPROVIDES:${PN} += "config-libsigscan-tools \
libsigscan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsigscan.so.1 \
libsigscan1"

inherit rpm
