SUMMARY = "A frame-capture based graphics debugger"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.44"

RPM_NAME = "renderdoc-1.44-1.3.aarch64.rpm"
RPM_HASH = "858fd5b34ff4de5abe02bb55067829fefb3fb4445832cfb46a4b9c0dbb9502315827f79903ba3e7fde989a220f7a1d59929cfa9119e38eaf3249d3de9f6bfa63"

RPROVIDES:${PN} += "librenderdoc.so \
renderdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
