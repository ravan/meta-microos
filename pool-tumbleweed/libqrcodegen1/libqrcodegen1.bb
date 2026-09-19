SUMMARY = "QR Code generator library"
DESCRIPTION = "C QR Code generator library"
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "libqrcodegen1-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "7702f42ff40e9af5ec9fc7bbb444f3497ca00fcd38173dadf612c1157a8221bcc710765b460c8be31b67f39b42df27f336d54621b88a206b10d146dff3c0530b"

RPROVIDES:${PN} += "libqrcodegen.so.1 \
libqrcodegen1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
