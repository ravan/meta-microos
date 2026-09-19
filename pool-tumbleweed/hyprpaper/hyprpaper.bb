SUMMARY = "Wayland wallpaper utility with IPC controls"
DESCRIPTION = "Hyprpaper is a wallpaper utility for Hyprland. \
It supports IPC controls for Hyprland and various \
image formats."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "hyprpaper-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "b16c7c113e06894cee459940e985bcbb0450238eef1bc6b9f48da534f19a2db25cfe003a86dcd352ea8cb26b655a49617a3c2b391de7bcb165391568b2149990"

RPROVIDES:${PN} += "hyprpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libhyprlang.so.2 \
libhyprtoolkit.so.6 \
libhyprutils.so.13 \
libhyprwire.so.3 \
libm.so.6 \
libmagic.so.1 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
