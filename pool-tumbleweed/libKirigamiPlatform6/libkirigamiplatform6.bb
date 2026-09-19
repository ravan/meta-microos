SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Based on Qt Quick Controls 2. This package contains the base shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKirigamiPlatform6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "375ede92c5d12612786ea4a1c403a6c0ade63062a7405240f59b98b2d2424c8eaa4d616498af9380c440445ee45b65d8bc4a7179470c3f4dd4c04877c462d91e"

RPROVIDES:${PN} += "libKirigami.so.6 \
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
libKirigamiPlatform6 \
libKirigamiPolyfill.so.6 \
libKirigamiPrimitives.so.6 \
libKirigamiTemplates.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
