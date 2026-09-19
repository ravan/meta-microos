SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "libXaw3d6-1.6.6-1.9.aarch64.rpm"
RPM_HASH = "55d38f1fd6eb740627ffc9253b3e5b1f3eb3ef1544fec2143a5890961db1e4fe445bff0e11c68fc0ba54ecac4ab630b11a7ac8e879b20f06508a7c40be34f11b"

RPROVIDES:${PN} += "libXaw3d.so.6 \
libXaw3d6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
