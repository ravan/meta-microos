SUMMARY = "Date And Time Plugin for the Xfce Panel"
DESCRIPTION = "The date and time plugin displays the current date and time on the panel and \
can open a calendar when clicked."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "xfce4-datetime-plugin-0.8.3-1.14.aarch64.rpm"
RPM_HASH = "8db97d9c7c06052a91e6834c1c59c3f459fe76f3c88bcaa73526111b530179b82a5826792e38c5fab41f35fa14ef3d12caf3c134655e9030ea11ba9af63a4036"

RPROVIDES:${PN} += "libdatetime.so \
xfce4-datetime-plugin \
xfce4-panel-plugin-datetime"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
