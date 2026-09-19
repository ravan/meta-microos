SUMMARY = "Xfce Session Manager for Wayland"
DESCRIPTION = "xfce4-wayland-experimental-session is the Wayland session manager \
for the Xfce desktop environment."
LICENSE = "GPL-2.0-only"

PV = "4.20.4"

RPM_NAME = "xfce4-session-wayland-experimental-4.20.4-1.3.aarch64.rpm"
RPM_HASH = "577064b795e9a6c66d2eeb78e88e1a3244032eb52d89d2abfe15ffaa97b738d2358c6a499a1edc8a7506f0197cb21accb7416eb9fbc8fd2a2f00a5d51360d26c"

RPROVIDES:${PN} += "xfce4-session-wayland-experimental"

RDEPENDS:${PN} += "labwc \
xfce4-session \
xwayland"

inherit rpm
