SUMMARY = "Data Visualization and Analysis software"
DESCRIPTION = "LabPlot provides an easy way to create, manage and edit plots. It allows you to \
produce plots based on data from a spreadsheet or on data imported from external \
files. Plots can be exported to several pixmap and vector graphic formats."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.1"

RPM_NAME = "labplot-2.12.1-3.12.aarch64.rpm"
RPM_HASH = "1d0fe5b86489abaa0722e61878e151495000a2f3400954e64ba1461eccdb7337847dd6aa61f0c0b3bc6d9bfbdff7209c3e5407bc439a8b6935d065338fde1e02"

RPROVIDES:${PN} += "labplot \
labplot-kf5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Mqtt.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6SerialPort.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcantorlibs.so.28 \
libcerf.so.2 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
liblz4.so.1 \
libm.so.6 \
libmarkdown.so.3 \
libmatio.so.14 \
libnetcdf.so.22 \
liborigin.so.3 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
libxcb.so.1 \
libz.so.1 \
libzstd.so.1 \
qt6-sql-sqlite"

inherit rpm
