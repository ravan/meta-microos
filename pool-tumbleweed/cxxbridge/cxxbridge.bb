SUMMARY = "Code generator for safe FFI between Rust and C++"
DESCRIPTION = "C++ code generator for integrating `cxx` crate into non-Cargo builds"
LICENSE = "MIT"

PV = "1.0.187"

RPM_NAME = "cxxbridge-1.0.187-1.6.aarch64.rpm"
RPM_HASH = "4053c9a371bb93eb80073561d8856715dd4f2cd1d861c4c0229fd8d28c662456823d9f01f322e3e1a0d42ccae0b43f9bedab09c9581ce05a0ae723bba28daac6"

RPROVIDES:${PN} += "bundled-rust-crate-anstyle \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-codespan-reporting \
bundled-rust-crate-cxxbridge-cmd \
bundled-rust-crate-equivalent \
bundled-rust-crate-hashbrown \
bundled-rust-crate-indexmap \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
cxxbridge"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
