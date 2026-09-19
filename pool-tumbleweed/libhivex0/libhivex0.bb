SUMMARY = "Windows Registry Hive extraction library"
DESCRIPTION = "Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "libhivex0-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "cfbd61224a16de553ee03983ca0a5f0f3a95274f3d414266ca163518f849ad71001749b75cb7d2b4ec80e11fa47123139e6c8d9f0b2c9438fc0f7716afa3e14a"

RPROVIDES:${PN} += "libhivex.so.0 \
libhivex0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
