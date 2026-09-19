SUMMARY = "Graph Theory IDE"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "rocs-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3e6bae320f25e6aa51e3fe2f9980cffe5554b552a2fd39de67ab99fb6c5375f7926db2d5337fd6258586954ef5d9c95cf2d03fa017397cd66dd3806d0c667fef"

RPROVIDES:${PN} += "rocs \
rocs5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6Parts.so.6 \
libKF6TextEditor.so.6 \
libKF6TextTemplate.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librocsgraphtheory.so.0 \
libstdc++.so.6"

inherit rpm
