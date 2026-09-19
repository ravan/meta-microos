SUMMARY = "Hyprland plugin: hyprfocus"
DESCRIPTION = "Plugins allow users to add extra functionality to Hyprland. \
 \
This plugin adds flashfocus for hyprland"
LICENSE = "BSD-3-Clause"

PV = "0.56.0"

RPM_NAME = "hyprland-plugin-hyprfocus-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "f6c451a0a3d10f0233e6a01d62042bcd3566e7625f368469e6a1d9332655f1cfe91470e5acd8798461bf473f292f692844d093322ddb354e424552ad3895c663"

RPROVIDES:${PN} += "hyprland-plugin-hyprfocus"

RDEPENDS:${PN} += "hyprland \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
