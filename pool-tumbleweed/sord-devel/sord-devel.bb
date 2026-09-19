SUMMARY = "Development files for libsord"
DESCRIPTION = "Development files for libsord. \
Sord is a lightweight C library for storing RDF data in memory."
LICENSE = "ISC"

PV = "0.16.22"

RPM_NAME = "sord-devel-0.16.22-1.3.aarch64.rpm"
RPM_HASH = "44d52e8fc02febd353ae821f1fb4c543e084d569947c132c66274ea72e95ed2e005c4f9124a1e48a6b4b2d0005b99d5453caf8d965a54557cda8252f6e8aaf99"

RPROVIDES:${PN} += "libsord-0-devel \
pkgconfig-sord-0 \
sord-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsord-0-0 \
pkgconfig-serd-0 \
pkgconfig-zix-0"

inherit rpm
