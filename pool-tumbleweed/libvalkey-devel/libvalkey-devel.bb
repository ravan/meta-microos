SUMMARY = "Valkey client library in C"
DESCRIPTION = "Libvalkey is the official C client for the Valkey database. It also supports \
any server that uses the RESP protocol (version 2 or 3). This project supports \
both standalone and cluster modes."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "libvalkey-devel-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "6e0d3e048339653b54a4d8c698892fdcd74439b9ef078dc7182c3cd4e6e9809e2d5904c0432ea7c31557d5b2ce3c16906b6b1ebd3e0debb6d43e836097ea5960"

RPROVIDES:${PN} += "cmake-valkey \
cmake-valkey-tls \
libvalkey-devel \
pkgconfig-valkey \
pkgconfig-valkey-tls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvalkey-tls0 \
libvalkey0 \
pkgconfig-valkey"

inherit rpm
