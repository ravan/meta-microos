SUMMARY = "Synthesize keyboard and mouse input on X11 and Wayland with various backends"
DESCRIPTION = "Synthesize keyboard and mouse input on X11 and Wayland with various backends."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "libinputsynth0_15-0-0.15.0-1.15.aarch64.rpm"
RPM_HASH = "c6ed4ada5abe9b9d4533f7fdbac34228f6179293d0c60ebb657e7ac87e0f4a9a7ef33ea52b3bd722d8c39dda4643ced68f0c4fe4b8af56c58a58bf05a099b7aa"

RPROVIDES:${PN} += "libinputsynth-0.15.so.0 \
libinputsynth-xdo.so \
libinputsynth-xi2.so \
libinputsynth0-15-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libxdo.so.4"

inherit rpm
