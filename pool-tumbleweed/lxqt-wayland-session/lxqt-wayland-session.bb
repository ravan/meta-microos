SUMMARY = "Files needed for the LXQt Wayland Session"
DESCRIPTION = "Files needed for the LXQt Wayland Session: Wayland session start script, \
its desktop entry for display managers and default configurations for \
actually supported compositors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-4.0"

PV = "0.4.1"

RPM_NAME = "lxqt-wayland-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "180a9284568d6a05a14ba779f280e73bccb9aea097b538c468b82449cdac082aca97752b4a07ebbaa9676df427f596317bb9a888bfd45be26d46ae92c396c437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-wayland-session"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
layer-shell-qt6 \
lxqt-session \
lxqt-wayland-session-default-compositor \
qt6-wayland \
xdg-user-dirs"

inherit rpm
