SUMMARY = "A VNC server for wlroots based Wayland compositors"
DESCRIPTION = "This is a VNC server for wlroots based Wayland compositors. \
It attaches to a running Wayland session, creates virtual input devices and exposes a single display via the RFB protocol. \
The Wayland session may be a headless one, so it is also possible to run wayvnc without a physical display attached."
LICENSE = "ISC"

PV = "0.10.1"

RPM_NAME = "wayvnc-0.10.1-1.2.aarch64.rpm"
RPM_HASH = "14f4dc3d712597d55120b71261451293a2884d142c6c23fdebd19b803881be0e80c8ce7af81ed49234d61405f3d8a147d69dbbd05b0d0df2145f66c4fa725430"

RPROVIDES:${PN} += "wayvnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaml.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libjansson.so.4 \
libneatvnc.so.1 \
libpam.so.0 \
libpixman-1.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
