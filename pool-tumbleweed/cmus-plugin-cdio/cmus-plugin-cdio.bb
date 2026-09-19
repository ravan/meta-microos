SUMMARY = "CDIO plugin for the C* Music Player"
DESCRIPTION = "This package provides CDIO support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-cdio-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "957d3a0d09e4b5c6dc76e61bfd6e0aa1f6f7c094b9933b3ca91ebfede1335d1c698d8fda1d0f68ba5152fc5175d0878ed1bfa721dc46a7937bd9ad612fc7dd2f"

RPROVIDES:${PN} += "cmus-plugin-cdio"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio.so.19"

inherit rpm
