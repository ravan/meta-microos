SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "libXaw3d8-1.6.6-1.9.aarch64.rpm"
RPM_HASH = "0b5092f058716a382931e162dee51c4a843e76187c20e67a325d2c2cd276039f00edbe2e80cedab9be7471888a66b5e7922d8c9089aa994c069b91f474326e98"

RPROVIDES:${PN} += "Xaw3d \
libXaw3d.so.8 \
libXaw3d8 \
xaw3d"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
