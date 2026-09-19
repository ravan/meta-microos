SUMMARY = "Automatically generates Rust FFI bindings to C and C++ libraries"
DESCRIPTION = "Automatically generates Rust FFI bindings to C (and some C++) libraries."
LICENSE = "BSD-3-Clause"

PV = "0.72.1"

RPM_NAME = "rust-bindgen-0.72.1-1.4.aarch64.rpm"
RPM_HASH = "3c0bd5f6e3a8f6fa19fedf52d9b75d0f3cb46b195bc809c78ba7ea61743ddb643cc2eb0c1364a18f05eef4468b58913d7929efcbcda53a21c5666399da910ec5"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-annotate-snippets \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bindgen \
bundled-rust-crate-bindgen-cli \
bundled-rust-crate-bitflags \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-either \
bundled-rust-crate-env-logger \
bundled-rust-crate-glob \
bundled-rust-crate-heck \
bundled-rust-crate-humantime \
bundled-rust-crate-is-terminal \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
rust-bindgen"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
