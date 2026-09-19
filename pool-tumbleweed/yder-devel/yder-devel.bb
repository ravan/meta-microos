SUMMARY = "Header files for yder"
DESCRIPTION = "Development and header files for yder."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.20"

RPM_NAME = "yder-devel-1.4.20-1.11.aarch64.rpm"
RPM_HASH = "be50ee951b4c4b9343bd433951975d1f328f3965bfd09561ca184abfd8c160aea27a26e45ede9e8160ee6c09528fc5635d92584f69bf1db5fb5f94f7d4fffea0"

RPROVIDES:${PN} += "cmake-Yder \
pkgconfig-libyder \
yder-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyder1-4 \
pkgconfig-liborcania \
pkgconfig-libsystemd"

inherit rpm
