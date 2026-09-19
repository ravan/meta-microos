SUMMARY = "X Color Management Implementation"
DESCRIPTION = "The libXcmX11 library is a reference implementation of the X Color Management specification. \
It allows to attach color regions to X windows to communicate with color \
+servers."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcmX11-0-0.5.4-1.32.aarch64.rpm"
RPM_HASH = "77da5f7a883ad281065adedefb014e6c61fbca39de6004381ec0216b07633fa527977c2677244c2050b88ddde1b06fb1ad53610c9ee564a965aa18a05ba16ea7"

RPROVIDES:${PN} += "libXcmX11-0 \
libXcmX11.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcmEDID.so.0 \
libXfixes.so.3 \
libXmu.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
