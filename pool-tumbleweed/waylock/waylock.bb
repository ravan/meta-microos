SUMMARY = "Small screenlocker for Wayland compositors"
DESCRIPTION = "Screenlocker for Wayland compositors implementing ext-session-lock-v1. \
(The v1 protocol is robust in that a crashing locker does not \
cause the session to be unlocked.)"
LICENSE = "ISC"

PV = "1.3.0"

RPM_NAME = "waylock-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "71965cf234560bec37a75cce16692b3d088da113de370747326bebc4f31e2dac032c5a7cc87dd505abb4c48dd1e39f3f74cab1ccdb4e08cfc856d55d32fa70db"

RPROVIDES:${PN} += "waylock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
