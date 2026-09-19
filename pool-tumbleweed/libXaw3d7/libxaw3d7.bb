SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "libXaw3d7-1.6.6-1.9.aarch64.rpm"
RPM_HASH = "abba74b0880e00be9fee10d3d6f5a3917fb77b50664b8165623bc32ae37f3038d59d81f1dec2a3e0f08fc233c20d715913ef932840067d2d419a1daa00e328f3"

RPROVIDES:${PN} += "libXaw3d.so.7 \
libXaw3d7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
