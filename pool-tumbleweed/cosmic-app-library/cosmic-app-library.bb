SUMMARY = "A template for getting started with COSMIC"
DESCRIPTION = "Cosmic App Library is an application launcher for the COSMIC desktop that lists \
all installed applications in a grid."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-app-library-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "2d5e5d882573f7e68461cd6562334cd0f77700b7a118d21fd335322519e030038ba5997816e0196acb7f6cdb1af1af27f3d568afe2a3dc95c3405a7be7a8347e"

RPROVIDES:${PN} += "cosmic-app-library"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
