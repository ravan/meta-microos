SUMMARY = "Qt 5 Declarative Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde23"

RPM_NAME = "libQtQuick5-5.15.19+kde23-1.3.aarch64.rpm"
RPM_HASH = "13e457375552a3bf743e03af8d774ff4930a51d5ccb19cb685a98fde0c2c202297c871987c8680ba7a882d0e23a15505b5c8e0b8b81119b7df98af254d816317"

RPROVIDES:${PN} += "libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5QmlWorkerScript.so.5 \
libQt5Quick.so.5 \
libQt5QuickParticles.so.5 \
libQt5QuickShapes.so.5 \
libQt5QuickTest.so.5 \
libQt5QuickWidgets.so.5 \
libQtQuick5 \
liblabsanimationplugin.so \
liblabsmodelsplugin.so \
libmodelsplugin.so \
libparticlesplugin.so \
libqmldbg-debugger.so \
libqmldbg-inspector.so \
libqmldbg-local.so \
libqmldbg-messages.so \
libqmldbg-native.so \
libqmldbg-nativedebugger.so \
libqmldbg-preview.so \
libqmldbg-profiler.so \
libqmldbg-quickprofiler.so \
libqmldbg-server.so \
libqmldbg-tcp.so \
libqmlfolderlistmodelplugin.so \
libqmllocalstorageplugin.so \
libqmlplugin.so \
libqmlsettingsplugin.so \
libqmlshapesplugin.so \
libqmlwavefrontmeshplugin.so \
libqquicklayoutsplugin.so \
libqtqmlstatemachine.so \
libqtquick2plugin.so \
libsharedimageplugin.so \
libwindowplugin.so \
libworkerscriptplugin.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
