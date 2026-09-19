SUMMARY = "Development files for fmt, a formatting library"
DESCRIPTION = "Development files for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "fmt-10-devel-10.2.1-1.10.aarch64.rpm"
RPM_HASH = "f152d75ca38a8e6db0012f0f6cd3c416efc6917093a3657c94acbc163b31cc138e178f2db084153bcbc5f034066c5182bb14718e22d960fb1dae2afd9a152523"

RPROVIDES:${PN} += "cmake-fmt \
fmt-10-devel \
pkgconfig-fmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmt10"

inherit rpm
