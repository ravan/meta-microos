SUMMARY = "Whiteboard application"
DESCRIPTION = "Drawy lets you create ideas, diagrams, and visual notes on an infinite \
whiteboard with a smooth and responsive canvas. You can draw with \
pressure-sensitive tablet support, add text, insert images, and use basic \
shapes such as rectangles, ellipses, arrows, and lines to organise your content \
clearly. You can choose your own color palette and export your work as image \
files whenever needed."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "drawy-1.0.2-1.2.aarch64.rpm"
RPM_HASH = "335adf5ad1c45c7bccc7848f1dddecb4422126c952e9e6456aaae5b2e44134ef0f692b94e5994ac691e5ecbac56d2329566f255d6cb8301d703a3d2e452e238d"

RPROVIDES:${PN} += "drawy \
libdrawyconfig.so.0 \
libdrawygui.so.0 \
libdrawywidgets.so.0 \
libstandardformplugin.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
