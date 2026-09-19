SUMMARY = "Simple text editor for X"
DESCRIPTION = "Xedit is a simple text editor for X."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "xedit-1.2.5-1.3.aarch64.rpm"
RPM_HASH = "8b7eefc5cb31e27b3d89730fb57a51ad01b13264c9cd80e757c000b941a4a850724e8c4ce6c0de6395ae722e247f63739e9dc23104c03d23eb2d546b6e9a9040"

RPROVIDES:${PN} += "xedit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
