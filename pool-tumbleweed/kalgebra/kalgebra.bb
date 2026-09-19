SUMMARY = "Math Expression Solver and Plotter"
DESCRIPTION = "KAlgebra is a math expression solver and plotter."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalgebra-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a79ce896602f28c44bacdf3420f6f5e3d01ad51d47ddcd38fcf7ce874ae24e2ae133951c3c54d42ff9632e1452f1e65a833b38a9ab8aec880a58f25fadf911fd"

RPROVIDES:${PN} += "kalgebra \
kalgebra5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAnalitza.so.9 \
libAnalitzaGui.so.9 \
libAnalitzaPlot.so.9 \
libAnalitzaWidgets.so.9 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
