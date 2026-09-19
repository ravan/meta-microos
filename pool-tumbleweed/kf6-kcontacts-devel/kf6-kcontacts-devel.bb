SUMMARY = "Development files for kcontacts"
DESCRIPTION = "Development files for kcontacts, a Qt library to access address books."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcontacts-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2dab3a752b06207801cd865b6e851338dc279cad0c252662d60228e78ea5e501b06c6f4cd7f6aee22b5ff97d8e1a32f8f7c7bc8383ba3d0a81fabebcb26db87f"

RPROVIDES:${PN} += "cmake-KF6Contacts \
kf6-kcontacts-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libKF6Contacts6"

inherit rpm
