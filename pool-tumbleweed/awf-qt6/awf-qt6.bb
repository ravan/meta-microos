SUMMARY = "Theme preview application for Qt 6"
DESCRIPTION = "A widget factory is a theme preview application for GTK and Qt. It \
displays the various widget types in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the program for Qt 6."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "awf-qt6-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "b1f840273aa91bf6ae79bb9caf666c982a80bf0aab011f4b1e9703bf315722775190b9078b4753dde9c87644867505b2cd3d873ce7c2d0eb4cd96eb9a378a77f"

RPROVIDES:${PN} += "awf-qt6"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
