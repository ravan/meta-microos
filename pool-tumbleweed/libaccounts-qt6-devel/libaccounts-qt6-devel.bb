SUMMARY = "Development files for libaccounts-qt6"
DESCRIPTION = "This package contains the development files for the accounts-qt6 library."
LICENSE = "LGPL-2.1-only"

PV = "1.16git.20231124T162152~18557f7"

RPM_NAME = "libaccounts-qt6-devel-1.16git.20231124T162152~18557f7-1.10.aarch64.rpm"
RPM_HASH = "fbe41d18f6335b686817ff6b88ae216611309369f7b253faad5d53f647c93c9f3c0efbfe651c347c7c73f4082e74639525d4d6e338a44aeadaadb70e9e8b33fd"

RPROVIDES:${PN} += "cmake-AccountsQt6 \
libaccounts-qt6-devel \
pkgconfig-accounts-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-qt6-1 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Xml"

inherit rpm
