SUMMARY = "Development files for fmt, a formatting library"
DESCRIPTION = "Development files for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "fmt-9-devel-9.1.0-1.12.aarch64.rpm"
RPM_HASH = "d6b82c47475fee6aaa3f7eaa7ed90fc268025967cbc0f142aa88b27ed205a7beef31a0fbf0a8546325d3e55a28b94ba51a010190db94347fc75c88f19f13ab41"

RPROVIDES:${PN} += "cmake-fmt \
fmt-9-devel \
pkgconfig-fmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmt9"

inherit rpm
