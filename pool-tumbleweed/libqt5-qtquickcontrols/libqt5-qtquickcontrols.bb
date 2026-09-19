SUMMARY = "Qt 5 Quick Controls Addon"
DESCRIPTION = "The Qt Quick Controls module provides a set of controls that \
can be used to build complete interfaces in Qt Quick."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtquickcontrols-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "c7bcde8146edbdd3b3c96b627c852c2aa27a79602aa872bd7c1bc52fdb6cb516c2b3e6be2b57546e5bd7807a669595ed4af30d4ccacd58570a769bea141ce27a"

RPROVIDES:${PN} += "libdialogplugin.so \
libdialogsprivateplugin.so \
libqt5-qtquickcontrols \
libqtquickcontrolsplugin.so \
libqtquickextrasflatplugin.so \
libqtquickextrasplugin.so \
libwidgetsplugin.so \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Controls.Styles.Flat.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Dialogs.Private.1 \
qt5qmlimport-QtQuick.Extras.1 \
qt5qmlimport-QtQuick.Extras.Private.1 \
qt5qmlimport-QtQuick.Extras.Private.CppUtils.1 \
qt5qmlimport-QtQuick.PrivateWidgets.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQtQuick5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.1 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Dialogs.Private.1 \
qt5qmlimport-QtQuick.Extras.1 \
qt5qmlimport-QtQuick.Extras.Private.1 \
qt5qmlimport-QtQuick.Extras.Private.CppUtils.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.PrivateWidgets.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
