SUMMARY = "Set of tools for X windows manipulation"
DESCRIPTION = "wmutils's core is a set of tools for manipulating X11 windows. \
Each tool only has one purpose."
LICENSE = "ISC"

PV = "1.5"

RPM_NAME = "wmutils-1.5-2.9.aarch64.rpm"
RPM_HASH = "dd8335d886880b9f5a03b21b7f02124a77573b3ecfa896a9ea991b668028a6bef46c607a55756b70d44b513d56a4c7abe1f84899b4714d4c2f6ca3e0510de58b"

RPROVIDES:${PN} += "wmutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-cursor.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
