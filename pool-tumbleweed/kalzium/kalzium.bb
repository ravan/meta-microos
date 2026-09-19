SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalzium-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "eb862a054e8455a6720c70c8c431c00e21807e96872d72edb6f947984ff4aab7353b9443aeb3ba59dce97799bf54c3a9d3f1723bd89dd3d50c2c0e11757d2685"

RPROVIDES:${PN} += "kalzium \
libcompoundviewer.so.5 \
libscience.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQtPlugins.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Plotting.so.6 \
libKF6TextWidgets.so.6 \
libKF6UnitConversion.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libopenbabel.so.8 \
libstdc++.so.6"

inherit rpm
