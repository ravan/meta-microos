SUMMARY = "SDDM theme for openSUSE"
DESCRIPTION = "This package contains a version of the Breeze SDDM theme customized \
for openSUSE and enables it by default."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20240313T170730~9c664b7"

RPM_NAME = "plasma6-sddm-theme-openSUSE-84.87~git20240313T170730~9c664b7-47.1.noarch.rpm"
RPM_HASH = "41869079f95d7f7c08b923b7083bad1707b76ff01ac4cab3bd2438a2d66821d2790981d92e49d64ea6b662e041d5b1c9b6bc4dfd2852b4f44468c842c4f06cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma6-sddm-theme-openSUSE \
sddm-theme-openSUSE"

RDEPENDS:${PN} += "qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.breeze.components \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.private.keyboardindicator \
wallpaper-branding-openSUSE"

inherit rpm
