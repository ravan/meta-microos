SUMMARY = "KDE Data plotting library"
DESCRIPTION = "KPlotWidget is a QWidget-derived class that provides a virtual base \
class for data plotting. The idea behind KPlotWidget is that a \
developer only has to specify information in 'data units', i.e. the \
natural units of the data being plotted. KPlotWidget automatically \
converts everything to screen pixel units."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Plotting6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6172a190545f1c3d5f11862670f5f7529d1f5302861bd12b5e194f40def28ebcdf156597f101fc8b49d3819089e17e461334703e05a98b2cd534831c24815632"

RPROVIDES:${PN} += "libKF6Plotting.so.6 \
libKF6Plotting6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
