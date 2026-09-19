SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.16"

RPM_NAME = "libXaw7-1.0.16-1.9.aarch64.rpm"
RPM_HASH = "17433e1a7d35ab5348182b98ff9c6728a2b4df67497c1ffb277e7fe8ec3623038d2de1708d94297318dda5346be8b0ebb9a0cd0aabeeaf2da775df9535a3fb04"

RPROVIDES:${PN} += "libXaw.so.7 \
libXaw7 \
libXaw7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
