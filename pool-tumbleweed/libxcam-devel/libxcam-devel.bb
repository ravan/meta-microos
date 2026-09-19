SUMMARY = "Development files for libxcam"
DESCRIPTION = "The libxcam-devel package contains libraries and header files for \
developing applications that use libxcam."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "libxcam-devel-1.5.0-5.15.aarch64.rpm"
RPM_HASH = "0e6b03953629c462da78a3ae0a4c935d8978dca860d9d2dc79f77422b65122640b77bc0b0facc14f4e29d7f92af1aa8272dfc49cee2d7629c59e0c8871526260"

RPROVIDES:${PN} += "libxcam-devel \
pkgconfig-libxcam"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcam1"

inherit rpm
