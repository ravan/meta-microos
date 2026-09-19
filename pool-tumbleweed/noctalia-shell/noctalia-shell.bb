SUMMARY = "A sleek and minimal desktop shell for Wayland"
DESCRIPTION = "Noctalia is a minimal desktop shell for Wayland, built on Quickshell \
(QtQuick/QML). It provides a status bar, dock, panels, notifications, \
lock screen, idle management, OSD, desktop widgets, wallpaper \
management, and multi-monitor support, while intentionally staying \
out of compositor responsibilities. \
 \
Native support is provided for Niri, Hyprland, Sway, Scroll, Labwc \
and MangoWC. Launch with: \
 \
    qs -c noctalia-shell"
LICENSE = "MIT"

PV = "4.7.7"

RPM_NAME = "noctalia-shell-4.7.7-3.2.noarch.rpm"
RPM_HASH = "013dae04e735ebe592cd79ce8961a07f2a51fa150f0c1c708c9e02169efad840f0d4430f55a4362e1bff7ba3106488d6034866324b1eed04a4357a926c04812e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noctalia-shell"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ImageMagick \
brightnessctl \
ffmpeg-8 \
noctalia-qs \
python3"

inherit rpm
