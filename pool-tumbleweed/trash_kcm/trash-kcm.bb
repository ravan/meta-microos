SUMMARY = "Trash KDE module"
DESCRIPTION = "This package provides a configuration module to modify trash settings."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "trash_kcm-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "146c09369156ca19b6cbd38695c2edec4cd075c216b0a5d6aa7f87c526424258977520ac4a8992b8b2c1bb85b5bea7c1181918108e29a81f15ad59280bbc810c"

RPROVIDES:${PN} += "trash-kcm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
