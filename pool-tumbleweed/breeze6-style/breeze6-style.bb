SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze style for Qt 6, color-scheme and aditional assets."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-style-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "aecac039d4d98a7b6fcf87fbfbcaa08cd8f339d9288d7c082049a868ae58708659ac515b905cf6848cf6d61049b6e9ce2b1b341545abfea0e4ec417bb5b7de1b"

RPROVIDES:${PN} += "breeze5-style \
breeze6-style"

RDEPENDS:${PN} += "kconf-update6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6Style.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
