SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kiconthemes-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "adc0f5f35285e4108a4a4bbeebdc99403d77939be8b6238fd45ccdb9ac3555516844318090e7a9183215f003eedf80fb20dc07fbdd28a89dd18c17f956f42134"

RPROVIDES:${PN} += "kf6-kiconthemes"

RDEPENDS:${PN} += "libKF6IconThemes.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
