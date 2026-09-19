SUMMARY = "XFCE Base System (Experimental Wayland Variant)"
DESCRIPTION = "Base packages for the XFCE Desktop Environment using Wayland. \
This pattern avoids all X11-specific dependencies and includes \
a minimal setup using `xfce4-session-wayland-experimental`, `labwc`, \
and `dbus-1-daemon`."
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_basis_wayland-20230212-12.3.aarch64.rpm"
RPM_HASH = "0a86ea8ffa5323282644b6e86288064e5a055675a34bb5202470cdd2ce4c496509e2092c63dd79f2be0021e5cbf98d1ea3633a77cd8e166b1eec7300d9000b01"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-openSUSE-xfce-basis-wayland \
patterns-xfce-xfce-basis-wayland"

RDEPENDS:${PN} += "dbus-1-daemon \
pattern- \
thunar \
thunar-volman \
xfce4-appfinder \
xfce4-notifyd \
xfce4-panel \
xfce4-power-manager \
xfce4-session-wayland-experimental \
xfce4-settings \
xfconf \
xfdesktop"

inherit rpm
