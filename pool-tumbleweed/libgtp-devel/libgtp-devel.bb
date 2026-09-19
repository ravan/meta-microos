SUMMARY = "Development files for the GTP library"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtp."
LICENSE = "GPL-2.0-only"

PV = "1.15.0"

RPM_NAME = "libgtp-devel-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "c634c7eda63a37c2e35f3afa1e3ad9006913c5917af368f8cbf710ebbedc20361bc1299cdae8a544b6385892b0c480481c79d2294ce04c2ea2ee7ba1223f1a10"

RPROVIDES:${PN} += "libgtp-devel \
pkgconfig-libgtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtp11"

inherit rpm
