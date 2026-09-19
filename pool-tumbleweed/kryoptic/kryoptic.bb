SUMMARY = "PKCS #11 software token written in Rust"
DESCRIPTION = "A PKCS #11 software token written in Rust."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "kryoptic-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "50953e1af40ec087068f184bcf43520b2aa424d350fd383ab78575830e635ee98432a84f28c8ea3a9dbf0d3c4201550350be8f8e78e80b3da72f8bf95769d81b"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-asn1 \
bundled-rust-crate-asn1-derive \
bundled-rust-crate-autocfg \
bundled-rust-crate-bimap \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-data-encoding \
bundled-rust-crate-either \
bundled-rust-crate-fallible-iterator \
bundled-rust-crate-fallible-streaming-iterator \
bundled-rust-crate-foldhash \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hashlink \
bundled-rust-crate-hex \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-kryoptic \
bundled-rust-crate-kryoptic-lib \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libsqlite3-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-ossl \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rusqlite \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-scc \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sdd \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serial-test \
bundled-rust-crate-serial-test-derive \
bundled-rust-crate-shlex \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-syn \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-uuid \
bundled-rust-crate-vcpkg \
bundled-rust-crate-winnow \
bundled-rust-crate-zmij \
kryoptic \
libkryoptic-pkcs11.so"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libsqlite3.so.0 \
sqlite3"

inherit rpm
