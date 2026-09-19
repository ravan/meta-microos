SUMMARY = "Hyprland plugin: borders-plus-plus"
DESCRIPTION = "Plugins allow users to add extra functionality to Hyprland. \
 \
This plugin adds one or two additional borders to windows"
LICENSE = "BSD-3-Clause"

PV = "0.56.0"

RPM_NAME = "hyprland-plugin-borders-plus-plus-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "39b199353230fde28af850b5ac8ecc36effd4798b21a8d75e108a8ababfa49ed6aed70a2f8fc3403e48e3e084fe0a6f4f24374ab2050f9b8a4257e32aa3ce5ec"

RPROVIDES:${PN} += "hyprland-plugin-borders-plus-plus"

RDEPENDS:${PN} += "hyprland \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
