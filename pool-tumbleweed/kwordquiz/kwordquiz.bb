SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "A flashcard and vocabulary learning program."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwordquiz-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c81498e2d651b6442c03a0219a50ac0e4d9cae5e0a797084717d7f1f6311a4437c20d301846ea27d916e2ecdf5fb49c0758603d8e377fd52193f3bce003aad49"

RPROVIDES:${PN} += "kwordquiz \
kwordquiz5"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6NewStuffCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
