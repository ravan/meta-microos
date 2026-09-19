SUMMARY = "Library for parsing CSS using the Rust cssparser crate"
DESCRIPTION = "A C++ library for parsing CSS that uses the Rust cssparser crate internally."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "cxx-rust-cssparser-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "caca060923714e603fed5a795df78aab2580f67168a41c0b7d2c85dc7cef3b4009d029fcc8ff052d240f06c82dd14111224e93fb1feece779d8130db4ea688e6"

RPROVIDES:${PN} += "cxx-rust-cssparser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxx-rust-cssparser.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
