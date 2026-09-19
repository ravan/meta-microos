SUMMARY = "Library for parsing CSS using the Rust cssparser crate"
DESCRIPTION = "A C++ library for parsing CSS that uses the Rust cssparser crate internally."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "cxx-rust-cssparser-devel-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "8e0687f482ec3b7f5296e769d788a8a6813ad9cb1d5a2aa29e38bc6833f424aecd8f80d1b17336ca8ee00d70f2cbb408c839f53ca2f3d27d6a6ed2b62d8d0116"

RPROVIDES:${PN} += "cmake-cxx-rust-cssparser \
cxx-rust-cssparser-devel"

RDEPENDS:${PN} += "kf6-extra-cmake-modules \
libcxx-rust-cssparser1"

inherit rpm
