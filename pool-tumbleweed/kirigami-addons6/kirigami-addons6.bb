SUMMARY = "Add-ons for the Kirigami framework"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma)."
LICENSE = "LGPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "kirigami-addons6-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "1eaf5b564c5909bcd0796cfebfd9b49dddd1199dc3437015bc7112925653baf9bff48c43c8dde1e543bcc0b86cf568eb66ba1e751ccc8ada067c0ea5f58e1a2f"

RPROVIDES:${PN} += "kirigami-addons6 \
libKirigamiAddonsStatefulAppplugin.so \
libcomponentslabsplugin.so \
libcomponentsplugin.so \
libdateandtimeplugin.so \
libdelegatesplugin.so \
libformcardplugin.so \
libonboardingplugin.so \
libsettingsplugin.so \
libsettingsprivateplugin.so \
libsoundsplugin.so \
libstatefulapplabsplugin.so \
libstatefulappprivateplugin.so \
libtableviewplugin.so \
libtreeviewplugin.so \
qt6qmlimport-org.kde.kirigamiaddons.components \
qt6qmlimport-org.kde.kirigamiaddons.components.1 \
qt6qmlimport-org.kde.kirigamiaddons.dateandtime \
qt6qmlimport-org.kde.kirigamiaddons.dateandtime.1 \
qt6qmlimport-org.kde.kirigamiaddons.delegates \
qt6qmlimport-org.kde.kirigamiaddons.delegates.1 \
qt6qmlimport-org.kde.kirigamiaddons.formcard \
qt6qmlimport-org.kde.kirigamiaddons.formcard.1 \
qt6qmlimport-org.kde.kirigamiaddons.labs.components \
qt6qmlimport-org.kde.kirigamiaddons.labs.components.1 \
qt6qmlimport-org.kde.kirigamiaddons.onboarding \
qt6qmlimport-org.kde.kirigamiaddons.onboarding.1 \
qt6qmlimport-org.kde.kirigamiaddons.settings \
qt6qmlimport-org.kde.kirigamiaddons.settings.1 \
qt6qmlimport-org.kde.kirigamiaddons.settings.private \
qt6qmlimport-org.kde.kirigamiaddons.settings.private.254 \
qt6qmlimport-org.kde.kirigamiaddons.sounds \
qt6qmlimport-org.kde.kirigamiaddons.sounds.0 \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp.1 \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp.labs \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp.labs.254 \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp.private \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp.private.254 \
qt6qmlimport-org.kde.kirigamiaddons.tableview \
qt6qmlimport-org.kde.kirigamiaddons.tableview.1 \
qt6qmlimport-org.kde.kirigamiaddons.treeview \
qt6qmlimport-org.kde.kirigamiaddons.treeview.1"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6Svg6 \
libKirigamiAddonsComponents.so.6 \
libKirigamiAddonsStatefulApp.so.6 \
libKirigamiAddonsStatefulApp6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.folderlistmodel \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.config \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.iconthemes \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.delegates \
qt6qmlimport-org.kde.kirigami.platform \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.qqc2desktopstyle.private \
qt6qmlimport-org.kde.sonnet"

inherit rpm
