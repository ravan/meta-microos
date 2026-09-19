SUMMARY = "GUI for installing, selecting and manipulating Kvantum themes"
DESCRIPTION = "This package provides configuration manager - GUI appligation for installing, selecting and manipulating Kvantum themes."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "kvantum-manager-1.1.8-1.2.aarch64.rpm"
RPM_HASH = "23442eb8d6a79093263a0d75e76f6a49c7bd7b125f2945eab7ccf43de723cae5a9ccd7c2920ae4fdd98e918bcbf81b98ad695dd520e09f5264e04efe34f3d212"

RPROVIDES:${PN} += "kvantum-manager"

RDEPENDS:${PN} += "kvantum-qt6 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
