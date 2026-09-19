SUMMARY = "The X11 Protocol: Event Interception extension"
DESCRIPTION = "The Evie protocol headers for X11 development. \
XEvIE is a X extension providing functionalities to allow a client to \
intercept keyboard/mouse events, and optionally modify them or consume \
them before delivery through the normal event delivery mechanisms. \
 \
It was included in X11R6.8 through Xorg server 1.5, but is no \
longer supported in current X server releases."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "evieproto-devel-1.1.1-4.28.aarch64.rpm"
RPM_HASH = "79767d14288241353428d7d3f8a00a22888cb066c37b6edd51adddfc0bf07234bf7f190bc80729703ea4e23aedc056eec35cbc579e80a8944f3651c1bec4f40a"

RPROVIDES:${PN} += "evieproto-devel \
pkgconfig-evieproto \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/evieproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
