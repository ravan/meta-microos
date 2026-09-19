SUMMARY = "An xdg-desktop-portal backend for wlroots"
DESCRIPTION = "xdg-desktop-portal backend for wlroots. \
 \
Make sure the `XDG_CURRENT_DESKTOP` env var is set in the D-Bus user session \
to one of the UseIn values in wlr.portal"
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "xdg-desktop-portal-wlr-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "74d9395f66b219042b3cca173e90b7b4f2e7de67b50af9b0d906c43df6615ce73e53a914a1330ae7d541824966cbdd489a16de1c41b1f2026b37f20b6a107a4e"

RPROVIDES:${PN} += "xdg-desktop-portal-wlr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libinih.so.0 \
libpipewire-0.3.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
