SUMMARY = "Development files for libadwaita-qt6"
DESCRIPTION = "The libadwaita-qt6-devel package contains libraries and header files for \
developing applications that use libadwaita-qt6-1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaita-qt6-devel-1.4.2-4.11.aarch64.rpm"
RPM_HASH = "f57411f5715c7d4f063cde5067c2eb83b72ac2b3943f0a64bcec2e8cefa9ae47fbd7a4e69f9705c45dbd50100286e6f79136a54f859e72cf34639780a28293dd"

RPROVIDES:${PN} += "cmake-AdwaitaQt6 \
libadwaita-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Widgets \
libadwaitaqt6-1"

inherit rpm
