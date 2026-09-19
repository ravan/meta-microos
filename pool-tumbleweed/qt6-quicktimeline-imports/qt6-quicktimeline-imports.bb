SUMMARY = "Qt 6 QuickTimeline QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 QuickTimeline module"
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktimeline-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "29901dbd7fcd1df1aaf255e94c86dc7dd7d3d82b3af43a16f49bb06c715d558c6e6c1277235a2a32a648ebf0f31ea8c4481d465d795527f9e1a28af141de5b76"

RPROVIDES:${PN} += "libqtquicktimelineblendtreesplugin.so \
libqtquicktimelineplugin.so \
qt6-quicktimeline-imports \
qt6qmlimport-QtQuick.Timeline \
qt6qmlimport-QtQuick.Timeline.1 \
qt6qmlimport-QtQuick.Timeline.2 \
qt6qmlimport-QtQuick.Timeline.6 \
qt6qmlimport-QtQuick.Timeline.BlendTrees \
qt6qmlimport-QtQuick.Timeline.BlendTrees.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6QuickTimeline.so.6 \
libQt6QuickTimelineBlendTrees.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
