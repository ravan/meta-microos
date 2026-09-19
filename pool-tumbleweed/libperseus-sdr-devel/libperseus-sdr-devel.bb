SUMMARY = "Development files for libperseus-sdr"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libperseus-sdr."
LICENSE = "GPL-3.0-only"

PV = "0.8.2"

RPM_NAME = "libperseus-sdr-devel-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "7a8cda01ba4882593f64488d2bf2c6fa0486b0d148cc5f7a7eee58acde6aa0c7e4e7562404d185c0ec9a0ecae4b411450020414d855ee7c93f0de7a11bff16b3"

RPROVIDES:${PN} += "libperseus-sdr-devel \
pkgconfig-libperseus-sdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libperseus-sdr0"

inherit rpm
