SUMMARY = "Development files for fmt, a formatting library"
DESCRIPTION = "Development files for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "12.1.0"

RPM_NAME = "fmt-devel-12.1.0-1.4.aarch64.rpm"
RPM_HASH = "8681d2783a4096c0b9ab345c77987207b7f24420b2d13aa3f1fcce9dc79c0181b8f565a839c8e525d0d826c68c59af94e3373be2803b694828ff08b38a881258"

RPROVIDES:${PN} += "cmake-fmt \
fmt-devel \
pkgconfig-fmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmt12"

inherit rpm
