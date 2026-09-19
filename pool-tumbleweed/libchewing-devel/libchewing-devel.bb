SUMMARY = "Development package for libchewing"
DESCRIPTION = "Development package for libchewing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libchewing-devel-0.12.0-1.4.aarch64.rpm"
RPM_HASH = "ef672c45f555b34a19f4a47b16c1574f1ca8716f010232746a6c1edacd9b9f6e0da92222a589dddbf25bab3d53e6e0cc36f58f2c691fe3ba43fa883398e47a70"

RPROVIDES:${PN} += "cmake-Chewing \
libchewing-devel \
pkgconfig-chewing"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchewing3"

inherit rpm
