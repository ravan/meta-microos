SUMMARY = "Development files for libcotp"
DESCRIPTION = "Pkg-config and header files for developing applications that use libcotp"
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "libcotp-devel-4.2.1-1.2.aarch64.rpm"
RPM_HASH = "624b5625f5300173e359b7681ebdf2c8046e7061b49b31769bc671c98a153006ccaaf4de7147a1ca471d0828f0c2dff5ce1cca0ea4478a57bf39cbf455ad9d43"

RPROVIDES:${PN} += "cmake-COTP \
libcotp-devel \
pkgconfig-cotp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcotp4"

inherit rpm
