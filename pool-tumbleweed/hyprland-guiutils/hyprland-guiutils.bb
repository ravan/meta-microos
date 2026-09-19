SUMMARY = "Hyprland GUI utilities"
DESCRIPTION = "Hyprland GUI utilities (successor to hyprland-qtutils)"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "hyprland-guiutils-0.2.1-1.6.aarch64.rpm"
RPM_HASH = "1acc0d02ca7b50d0fc974c8dcb33f966e428557926b0708a8ae5b2f8d8c6157102e34b58a4f515c87d68eff23382a5d798fee1181c4a99460fbba321d3008a50"

RPROVIDES:${PN} += "hyprland-guiutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhyprtoolkit.so.6 \
libhyprutils.so.13 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
