SUMMARY = "Plasma 6 theme for openSUSE"
DESCRIPTION = "This package contains the Plasma 6 Look-and-feel package for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20240313T170730~9c664b7"

RPM_NAME = "plasma6-theme-openSUSE-84.87~git20240313T170730~9c664b7-47.1.noarch.rpm"
RPM_HASH = "140eae39a0f1ca24afd07b1cbc8c7ded48c9862a0d6556e9d6c2e1dbca82b0d888a92d7efdb076387fad5b54890e6f0a17178138ddbc9450fcd696b9fcc8f850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma6-theme-openSUSE"

RDEPENDS:${PN} += "plasma6-desktop \
plasma6-workspace \
qt6qmlimport-Qt5Compat.GraphicalEffects.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.breeze.components \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.private.sessions \
wallpaper-branding-openSUSE"

inherit rpm
