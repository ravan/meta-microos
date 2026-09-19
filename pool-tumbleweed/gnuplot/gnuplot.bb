SUMMARY = "Function Plotting Utility and more"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "6.0.4"

RPM_NAME = "gnuplot-6.0.4-1.5.aarch64.rpm"
RPM_HASH = "fbb5458a517726f434b2447621fd2917160c604feca03da2fac261419880b24cb513b2ef333481c44de7c8d7f5756e1e7e522392b32b9198a22997fc9b9df689"

RPROVIDES:${PN} += "gnuplot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libcaca.so.0 \
libcairo.so.2 \
libcerf.so.2 \
libgcc-s.so.1 \
libgd.so.3 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libopenspecfun.so.2 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
