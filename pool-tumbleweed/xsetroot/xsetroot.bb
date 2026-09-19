SUMMARY = "Utility to set X root window parameter"
DESCRIPTION = "The xsetroot program allows you to tailor the appearance of the \
background ('root') window on a workstation display running X."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "xsetroot-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "5f702b50a2a13c59809f56aadb472dfa0ddfcc1310aa6db5e236162f2e2b502a75b2a9c0c62f33b554d38f86b7ffa3cf3e25a9760b0e2434b3273f4a6f50b89b"

RPROVIDES:${PN} += "xsetroot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
