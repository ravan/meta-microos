SUMMARY = "Development files for libcpuid"
DESCRIPTION = "The libcpuid-devel package contains libraries and header files for \
developing applications that use libcpuid. \
For details about the programming API, please see the docs \
on the project's site (http://libcpuid.sourceforge.net/)"
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "libcpuid-devel-0.8.1-2.3.aarch64.rpm"
RPM_HASH = "64f52743135f74def7c48f1b7e9a95ad90f5ffd4d2cc501e43a5ba8b937d92fb17f24692bb8153f11bb1207e6b09bbddfc56f0a52b8ef6f35e204064eaf91309"

RPROVIDES:${PN} += "libcpuid-devel \
pkgconfig-libcpuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpuid18"

inherit rpm
