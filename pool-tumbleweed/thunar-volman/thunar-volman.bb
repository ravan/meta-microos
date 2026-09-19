SUMMARY = "Thunar Volume Manager"
DESCRIPTION = "The Thunar Volume Manager is an extension for the Thunar file manager, \
which enables automatic management of removable drives and media. For \
example, if thunar-volman is installed and configured properly, and you \
plug in your digital camera, it will automatically launch your \
preferred photo application and import the new pictures from the camera \
into your photo collection."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "thunar-volman-4.20.0-1.7.aarch64.rpm"
RPM_HASH = "1ba5380866631837c48463f0894b906cce048c48ec781c7dbd82a8350e47c810aa3f3372b52a2dd494e789aa3d8a1da1937d66d54fe32dfabec957f4497a8a6a"

RPROVIDES:${PN} += "thunar-volman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
