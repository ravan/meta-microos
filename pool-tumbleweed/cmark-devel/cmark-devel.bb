SUMMARY = "Development files for cmark library"
DESCRIPTION = "This package provides the development files for cmark."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.31.1"

RPM_NAME = "cmark-devel-0.31.1-1.4.aarch64.rpm"
RPM_HASH = "959bef5b6fbf84714b9ee5f4a5beeec23f3736f7caf61a69d5a41f3479600ee264df9edd48bbd31bbf2dfaf30ec9b1aade669f77948ff1f935d375f4a95a732e"

RPROVIDES:${PN} += "cmake-cmark \
cmark-devel \
pkgconfig-libcmark"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmark \
libcmark0-31-1"

inherit rpm
