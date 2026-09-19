SUMMARY = "Library to parse flash media stream URLs -- Development Files"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-devel-0.9.4-8.11.aarch64.rpm"
RPM_HASH = "cc24a988e588dc1aec89940aaf68d49ccee9abb33d9aee0795b4a4a5ae884bc044ed283eb88902bef04dd93ec02b5f6a3492cbca7e6f4de4ccab63b4262b4334"

RPROVIDES:${PN} += "libquvi-devel \
pkgconfig-libquvi-0.9"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquvi-0-9-0-9-4"

inherit rpm
