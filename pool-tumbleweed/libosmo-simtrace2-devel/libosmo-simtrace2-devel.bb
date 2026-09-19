SUMMARY = "Development files for the Osmocom SIMtrace2 library"
DESCRIPTION = "Osmocom SIMtrace2 (and compatible) USB device firmware.  It enables \
applications to implement SIM card / smart card tracing as well as \
SIM / smart card emulation functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-simtrace2."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-simtrace2-devel-0.8.0-1.19.aarch64.rpm"
RPM_HASH = "0fec9f1ec8862caa7ac29c6294133942d0160c9f512ca1f376a81ec61f86d4e8b234efb7e62d2ddcabe75e89bc2776c0cfb73633b592a378b30d1e7ee51db734"

RPROVIDES:${PN} += "libosmo-simtrace2-devel \
pkgconfig-libosmo-simtrace2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-simtrace2-1"

inherit rpm
