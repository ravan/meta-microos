SUMMARY = "Qt 6 Declarative Tools"
DESCRIPTION = "Additional tools for inspecting, testing, viewing QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-tools-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "32a34d21cc0bf7b7a021fced3b02ec3955331671dc5de84664dadf4e3d39bda7510130953e75bfa2f7285bf7ece671a9409688747995132b3a6184614b2f9efc"

RPROVIDES:${PN} += "libqdslintplugin.so \
libqmldbg-debugger.so \
libqmldbg-inspector.so \
libqmldbg-local.so \
libqmldbg-messages.so \
libqmldbg-native.so \
libqmldbg-nativedebugger.so \
libqmldbg-preview.so \
libqmldbg-profiler.so \
libqmldbg-quickeventreplay.so \
libqmldbg-quickprofiler.so \
libqmldbg-server.so \
libqmldbg-tcp.so \
libqmllsquickplugin.so \
libquicklintplugin.so \
qt6-declarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QmlCompiler.so.6 \
libQt6Quick.so.6 \
libQt6QuickTest.so.6 \
libQt6QuickVectorImageGenerator.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
