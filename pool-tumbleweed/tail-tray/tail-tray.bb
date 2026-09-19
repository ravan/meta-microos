SUMMARY = "Tailscale tray menu and UI for the KDE Plasma Desktop"
DESCRIPTION = "Tailscale tray menu and UI for Plasma Desktop \
 \
Features \
 \
- Control your Tailscale connection from the tray \
- Show IPs \
- Show current connection status of your devices \
- Overview of your network and network status \
- Set and change your Tailscale exit node \
- Proper multi account handling \
- Tail drive support - Working with davfs2 support + additional help setting up \
  davfs2 and mounting etc \
- Send files to any device on your Tailnet directly from the tray menu \
- Get notified and receive files from any device on your Tailnet to a \
  pre-defined location on disk"
LICENSE = "GPL-3.0-only"

PV = "0.2.33"

RPM_NAME = "tail-tray-0.2.33-1.2.aarch64.rpm"
RPM_HASH = "506b251a21f04285f03635883066a4f96d717d8441ecc62188b7bc98353e27f90c1eff0f90b714aeadf9ec87e50ea95569c5e08f9a7399d7f486b07df2805bbc"

RPROVIDES:${PN} += "tail-tray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
tailscale"

inherit rpm
