SUMMARY = "UML Modeller"
DESCRIPTION = "Umbrello is a UML modelling application."
LICENSE = "GFDL-1.2-only & GPL-2.0-only & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "umbrello-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8ad4389852dc0bb000ee9dbb7d8556af0c606488df8fe5b59519968592bffae496eb27ea2617bfafb4f0413aca35dc865f5a34373ea1ab0e0ca2ad801ae77b00"

RPROVIDES:${PN} += "umbrello \
umbrello5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6TextEditor.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
