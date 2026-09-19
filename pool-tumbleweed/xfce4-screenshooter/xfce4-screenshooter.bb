SUMMARY = "Screenshot Tool for the Xfce Desktop"
DESCRIPTION = "Xfce4 Screenshooter is a tool for taking screenshots, it can capture the entire \
screen, the active window or a selected region. Screenshots may be taken with a \
user-specified delay and the resulting images can be saved to a PNG file, \
copied it to the clipboard, opened with another application, or uploaded to \
ZimageZ, a free online image hosting service."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.3"

RPM_NAME = "xfce4-screenshooter-1.11.3-2.2.aarch64.rpm"
RPM_HASH = "1b0af66241faaed0200b535189c40d8fdcd57f7cc0aa81bdfad6e987f668bf8a2e3be7c123984d03007a351de55e90cbafd72c1039e648a7d458bf71bd5c6187"

RPROVIDES:${PN} += "xfce4-screenshooter \
xfce4-screenshooter-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxfce4ui-2.so.0 \
libxfce4ui-tools \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
