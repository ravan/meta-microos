SUMMARY = "Development files for coeurl"
DESCRIPTION = "Development files for coeurl."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "coeurl-devel-0.3.1-5.7.aarch64.rpm"
RPM_HASH = "be56e17f241562092beb5390fb2637599f94691ab00898167e74334eaf71a3f1f52d32dae7edcc2a3b5a9fe286af0e443fec57e225b6e1b6df8784a013d8de37"

RPROVIDES:${PN} += "coeurl-devel \
pkgconfig-coeurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcoeurl0-3 \
pkgconfig-libcurl \
pkgconfig-libevent-core \
pkgconfig-libevent-pthreads \
pkgconfig-spdlog"

inherit rpm
