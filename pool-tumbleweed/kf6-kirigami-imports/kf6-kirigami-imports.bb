SUMMARY = "Kirigami QML components"
DESCRIPTION = "Kirigami QML and runtime components based on KF6 and Qt6"
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kirigami-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "eec37794282a03e2b01f74a841a0e4bf1b2a25465729f011ed92b222f2927ebe5fdd0d4b98ec2f03a7f28ba12d7c9d6e53a9a36994c7e3eee0907680eb07902b"

RPROVIDES:${PN} += "kf6-kirigami-imports \
libKirigamiControlsplugin.so \
libKirigamiDelegatesplugin.so \
libKirigamiDialogsplugin.so \
libKirigamiFormsPrivateCardsplugin.so \
libKirigamiFormsPrivateFlatplugin.so \
libKirigamiFormsPrivateTemplatesplugin.so \
libKirigamiFormsplugin.so \
libKirigamiLayoutsPrivateplugin.so \
libKirigamiLayoutsplugin.so \
libKirigamiPlatformplugin.so \
libKirigamiPolyfillplugin.so \
libKirigamiPrimitivesplugin.so \
libKirigamiPrivate.so.6 \
libKirigamiPrivateplugin.so \
libKirigamiTemplatesplugin.so \
libKirigamiplugin.so \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kirigami.controls \
qt6qmlimport-org.kde.kirigami.controls.2 \
qt6qmlimport-org.kde.kirigami.delegates \
qt6qmlimport-org.kde.kirigami.delegates.254 \
qt6qmlimport-org.kde.kirigami.dialogs \
qt6qmlimport-org.kde.kirigami.dialogs.2 \
qt6qmlimport-org.kde.kirigami.forms \
qt6qmlimport-org.kde.kirigami.forms.2 \
qt6qmlimport-org.kde.kirigami.forms.private.cards \
qt6qmlimport-org.kde.kirigami.forms.private.cards.2 \
qt6qmlimport-org.kde.kirigami.forms.private.flat \
qt6qmlimport-org.kde.kirigami.forms.private.flat.2 \
qt6qmlimport-org.kde.kirigami.forms.private.templates \
qt6qmlimport-org.kde.kirigami.forms.private.templates.2 \
qt6qmlimport-org.kde.kirigami.layouts \
qt6qmlimport-org.kde.kirigami.layouts.2 \
qt6qmlimport-org.kde.kirigami.layouts.private \
qt6qmlimport-org.kde.kirigami.layouts.private.2 \
qt6qmlimport-org.kde.kirigami.platform \
qt6qmlimport-org.kde.kirigami.platform.2 \
qt6qmlimport-org.kde.kirigami.primitives \
qt6qmlimport-org.kde.kirigami.primitives.2 \
qt6qmlimport-org.kde.kirigami.private \
qt6qmlimport-org.kde.kirigami.private.254 \
qt6qmlimport-org.kde.kirigami.private.polyfill \
qt6qmlimport-org.kde.kirigami.private.polyfill.1 \
qt6qmlimport-org.kde.kirigami.templates \
qt6qmlimport-org.kde.kirigami.templates.2"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKirigami.so.6 \
libKirigamiControls.so.6 \
libKirigamiDelegates.so.6 \
libKirigamiDialogs.so.6 \
libKirigamiForms.so.6 \
libKirigamiFormsPrivateCards.so.6 \
libKirigamiFormsPrivateFlat.so.6 \
libKirigamiFormsPrivateTemplates.so.6 \
libKirigamiLayouts.so.6 \
libKirigamiLayoutsPrivate.so.6 \
libKirigamiPlatform.so.6 \
libKirigamiPolyfill.so.6 \
libKirigamiPrimitives.so.6 \
libKirigamiTemplates.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Material \
qt6qmlimport-QtQuick.Controls.impl \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window"

inherit rpm
