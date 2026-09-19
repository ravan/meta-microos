SUMMARY = "A follow the mouse X demo"
DESCRIPTION = "Xeyes watches what you do and reports to the Boss."
LICENSE = "X11"

PV = "1.3.1"

RPM_NAME = "xeyes-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "b2dc6b7bb30b329bd2e6b7072db75101430182523c8c8eaa8ebe3de2495c79512ec8d9af6be7d6ccf302e3d92a0135bd3572e82d4aa658bc426b776de9ed7899"

RPROVIDES:${PN} += "xeyes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxcb-damage.so.0 \
libxcb-present.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
