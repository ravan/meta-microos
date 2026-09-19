SUMMARY = "Alternate Xfce Menu"
DESCRIPTION = "Whisker Menu is an alternate application launcher for Xfce. When \
opened, it shows a list of applications marked as favorites. \
Installed applications can be browsed by clicking on the category \
buttons on the side. Whisker Menu keeps a list of most recent used \
applications launched from it."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.1"

RPM_NAME = "xfce4-whiskermenu-plugin-2.10.1-1.2.aarch64.rpm"
RPM_HASH = "8196c3466b894b9958bce1a1f00d626a3b36eef6f47c14d7ca7c8a633048dd218987d9d831591de631561c38a2e8a14c0befdbc06f8a09a053be6a0fe3f44a6f"

RPROVIDES:${PN} += "libwhiskermenu.so \
xfce4-panel-plugin-whiskermenu \
xfce4-whiskermenu-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgarcon-1.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
