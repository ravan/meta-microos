SUMMARY = "Wayland Conformance Test Suite"
DESCRIPTION = "wlcs is a protocol conformance verifying test suite usable by Wayland \
compositor implementors. \
 \
wlcs relies on compositors providing an integration module, providing \
wlcs with API hooks to start a compositor, connect a client, move a \
window, and so on. \
 \
Tests (generally) run in the same address space as the compositor, so \
there is a consistent global clock available, it is convenient to \
poke around in compositor internals, and standard debugging tools can \
follow control flow from the test client to the compositor and back \
again."
LICENSE = "GPL-3.0-only & GPL-2.0-only"

PV = "1.7.0"

RPM_NAME = "wlcs-1.7.0-1.12.aarch64.rpm"
RPM_HASH = "4ce1f2bb382163949bcde80c2d797a1846a9506b2de7947cca951ab80e24c69fe2f59471a5830155bf20c1beefb19002720483dcd580305020933920828cde1c"

RPROVIDES:${PN} += "wlcs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasan.so.8 \
libc.so.6 \
libgcc-s.so.1 \
libgmock.so.1.17.0 \
libgtest.so.1.17.0 \
libstdc++.so.6 \
libubsan.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
