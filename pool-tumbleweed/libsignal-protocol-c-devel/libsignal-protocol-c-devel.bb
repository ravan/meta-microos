SUMMARY = "Development files for libsignal-protocol-c"
DESCRIPTION = "Development files and headers for libsignal-protocol-c"
LICENSE = "GPL-3.0-only"

PV = "2.3.3"

RPM_NAME = "libsignal-protocol-c-devel-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "00f464759d5ec1f94b638a7afa60fb485aec884514d62e6a6c087e2e2a52f9bb5f804eea62a64456c5eac1d6b89d0a85b242e40d914e4a5e5c8924a8cd87308c"

RPROVIDES:${PN} += "libsignal-protocol-c-devel \
pkgconfig-libsignal-protocol-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignal-protocol-c2"

inherit rpm
