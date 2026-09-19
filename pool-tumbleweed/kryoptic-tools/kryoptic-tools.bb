SUMMARY = "Supporting tools for kryoptic software token"
DESCRIPTION = "Supporting tools for kryoptic software token. Most notably a migration tool for \
the SoftHSM database."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "kryoptic-tools-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "334eacdd9b751eaefaa9ce8bdd63cc607b2345a08b3837f8c0eb34d0960390c28a7009df1e1e6b4c4cfc150356ab465c9507a09d41b44e1b9fe3f63945a767c2"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstyle \
bundled-rust-crate-asn1 \
bundled-rust-crate-asn1-derive \
bundled-rust-crate-autocfg \
bundled-rust-crate-bimap \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-cryptoki \
bundled-rust-crate-cryptoki-sys \
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
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-kryoptic-lib \
bundled-rust-crate-kryoptic-tools \
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
bundled-rust-crate-secrecy \
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
bundled-rust-crate-zeroize \
bundled-rust-crate-zmij \
kryoptic-tools"

RDEPENDS:${PN} += "kryoptic \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libsqlite3.so.0"

inherit rpm
