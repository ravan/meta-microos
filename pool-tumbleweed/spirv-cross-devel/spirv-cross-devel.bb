SUMMARY = "Development headers for the SPIRV-Cross library"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.4.313.0"

RPM_NAME = "spirv-cross-devel-1.4.313.0-1.5.aarch64.rpm"
RPM_HASH = "7aede11fd2a77b10658d423da7ee926d85ff47d2b6ccd140d58d5b56d5035455f9e6c459a38d184746bc34b0f88480301af5826e2bf1dc4b6bb08422a7ace8e1"

RPROVIDES:${PN} += "libspirv-cross-c-shared-devel \
pkgconfig-spirv-cross-c \
pkgconfig-spirv-cross-c-shared \
spirv-cross-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspirv-cross-c-shared0"

inherit rpm
