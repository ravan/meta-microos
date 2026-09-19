SUMMARY = "Development files for libzupt"
DESCRIPTION = "The libzupt-devel package contains library and header files for developing \
applications that use libzupt."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "libzupt-devel-1.0.8-1.4.aarch64.rpm"
RPM_HASH = "9a68a24f62d6c45ad36c4a5c74812a6cb1c9cff139b442f85353a771b197dba3cb8254d58105d0626a4139acbb3a29b46913529a21bf2e4f4d29fae1c799d5ee"

RPROVIDES:${PN} += "cmake-libzupt \
libzupt-devel \
pkgconfig-libzupt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzupt1"

inherit rpm
