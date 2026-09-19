SUMMARY = "Interactive Geometry"
DESCRIPTION = "Kig is an application for Interactive Geometry. It's intended to serve \
two purposes: Allow students to interactively explore mathematical \
figures and concepts using the computer. Serve as a WYSIWYG tool for \
drawing mathematical figures and including them in other documents."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kig-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8c0924f040b14c13224baa6facf837009974b9e019e3c295ed2f7975ddcb4665a43a3f505aded001d6bd4793f63237d701e0237d364a49e086006cef2867129f"

RPROVIDES:${PN} += "kig \
kig5"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6Parts.so.6 \
libKF6TextEditor.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6"

inherit rpm
