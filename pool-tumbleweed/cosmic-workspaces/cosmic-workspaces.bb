SUMMARY = "COSMIC workspaces"
DESCRIPTION = "COSMIC workspaces."
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "cosmic-workspaces-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "d73d9357e5b1e59ee62f96355907f255c1f70072f50e928f810d8dc96693873ecdc4bc4865647194f3860087e5faf7bde0abc79fb04e0057a01d249dead9070b"

RPROVIDES:${PN} += "cosmic-workspaces"

RDEPENDS:${PN} += "libc.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
