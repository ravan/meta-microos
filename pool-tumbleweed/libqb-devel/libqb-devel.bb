SUMMARY = "Development files for libqb"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.9+20250916.4b496d0"

RPM_NAME = "libqb-devel-2.0.9+20250916.4b496d0-1.5.aarch64.rpm"
RPM_HASH = "701ac2825afee7e90d642635dbf1aa79d533ef2fb335249b2e83846d4c8fde952f3904f1a888393bcdd166ea6dcc659b7d32e055d1e092f97bbee40e58e0fabf"

RPROVIDES:${PN} += "libqb-devel \
pkgconfig-libqb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqb100"

inherit rpm
