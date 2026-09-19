SUMMARY = "Plasma KCM for plasma-keyboard"
DESCRIPTION = "KCM for plasmakeyboard, for systemsettings integration"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-keyboard-kcm-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b856bbfe91cf59a900812c5a2417efe37e7ae6bbb3701ff7b02e180d35172c473d9e060ebaa131eb9aa0153bf0aa3d7fefee3bbcac4ea24003dbf0d83753ac40"

RPROVIDES:${PN} += "plasma6-keyboard-kcm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
plasma6-keyboard \
systemsettings6"

inherit rpm
