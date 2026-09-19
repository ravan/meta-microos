SUMMARY = "Open source clone of Asus launcher for Netbooks"
DESCRIPTION = "LXLauncher is an open source clone of Asus launcher for \
EeePC or Netbooks anyway. It's an LXDE project and it's \
based on menu-cache library."
LICENSE = "GPL-3.0"

PV = "0.2.5"

RPM_NAME = "lxlauncher-0.2.5-17.36.aarch64.rpm"
RPM_HASH = "3d7dd702f52c33caec4179ca3f7b789855de5482399849631f39c8ce78cb9c6209108222904f797ccf5249cb5347e62f8fb48c3e84e1557d0c3f310c5061d2e3"

RPROVIDES:${PN} += "config-lxlauncher \
lxlauncher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libmenu-cache.so.3 \
libstartup-notification-1.so.0"

inherit rpm
