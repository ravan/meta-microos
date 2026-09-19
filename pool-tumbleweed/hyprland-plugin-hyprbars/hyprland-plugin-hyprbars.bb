SUMMARY = "Hyprland plugin: hyprbars"
DESCRIPTION = "Plugins allow users to add extra functionality to Hyprland. \
 \
This plugin adds title bars to windows"
LICENSE = "BSD-3-Clause"

PV = "0.56.0"

RPM_NAME = "hyprland-plugin-hyprbars-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "19c7a0953c9a06c5d784754cfa29ee576dbbf492ce3a7c3632fe57cc67a1247c612d5b2db05e0fd935d13c00c6adf879b573de3f7d9c9655fbf822ef88d5f266"

RPROVIDES:${PN} += "hyprland-plugin-hyprbars"

RDEPENDS:${PN} += "hyprland \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
