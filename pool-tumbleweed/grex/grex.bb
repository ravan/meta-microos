SUMMARY = "CLI regex generator"
DESCRIPTION = "grex is a library as well as a command-line utility that is meant to simplify the \
often complicated and tedious task of creating regular expressions. It does so by \
automatically generating a single regular expression from user-provided test cases. \
The resulting expression is guaranteed to match the test cases which it was generated from. \
 \
It started as a Rust port of the JavaScript tool regexgen written by Devon Govett."
LICENSE = "Apache-2.0 & MPL-2.0 & MIT & (Apache-2.0 | MIT) & BSL-1.0 & Apache-2.0-with-LLVM-exception"

PV = "1.4.6"

RPM_NAME = "grex-1.4.6-1.5.aarch64.rpm"
RPM_HASH = "f20074d899acdd0f6b5fcfb2cde76362ef7cc3f83dd026c2538e131cd2a3e27fa78d6816740ef70044b7690f1d01ee1b89989c5b54b422648b519fb230caca23"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-foldhash \
bundled-rust-crate-grex \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-matrixmultiply \
bundled-rust-crate-memchr \
bundled-rust-crate-ndarray \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-petgraph \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rawpointer \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-unicode-general-category \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-utf8parse \
grex"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
