SUMMARY = "A GTK4-based panel for wayfire"
DESCRIPTION = "wf-shell is a repository which contains the various components needed to built a fully functional DE based around wayfire. Currently it has only a GTK-based panel and background client."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wf-shell-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "c4ed16123af0b3c6a51571976d3c9a95646a493fb6eddeeb9f846decb9a244a861c40582d508eb24a7c2149b24760bd9d1d1b85a22f3f5b815881a9996d9c89f"

RPROVIDES:${PN} += "wf-shell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairomm-1.16.so.1 \
libcrypto.so.3 \
libdbusmenu-glib.so.4 \
libddcutil.so.5 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtk4-layer-shell.so.0 \
libgtkmm-4.0.so.0 \
libm.so.6 \
libpam.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwf-config.so.1 \
libwireplumber-0.5.so.0 \
libxkbregistry.so.0 \
libyyjson.so.0"

inherit rpm
