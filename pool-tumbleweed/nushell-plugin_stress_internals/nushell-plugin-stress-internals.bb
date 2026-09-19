SUMMARY = "Plugin nu_plugin_stress_internals for nushell"
DESCRIPTION = "Plugin nu_plugin_stress_internals for nushell."
LICENSE = "MIT"

PV = "0.115.1"

RPM_NAME = "nushell-plugin_stress_internals-0.115.1-1.2.aarch64.rpm"
RPM_HASH = "fff9f2de6ec5692979cba6ea343334e233d9399ba267c0dfe68e28812c44bd8fbaf2bdb13410903da2d7bac35e4aae3754e774ae404746546b1e9b2bbe5d156a"

RPROVIDES:${PN} += "bundled-rust-crate-allocator-api2 \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-doctest-file \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-foldhash \
bundled-rust-crate-hashbrown \
bundled-rust-crate-indexmap \
bundled-rust-crate-interprocess \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-memchr \
bundled-rust-crate-nu-plugin-stress-internals \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-zmij \
nushell-plugin-stress-internals"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
nushell"

inherit rpm
