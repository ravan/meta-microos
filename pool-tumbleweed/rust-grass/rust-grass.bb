SUMMARY = "A Sass compiler written purely in Rust"
DESCRIPTION = "This crate aims to provide a high level interface for compiling \
Sass into plain CSS. It offers a very limited API, currently \
exposing only 2 functions. \
 \
In addition to a library, this crate also includes a binary that is \
intended to act as an invisible replacement to the Sass commandline \
executable."
LICENSE = "MIT"

PV = "0.13.4"

RPM_NAME = "rust-grass-0.13.4-2.6.aarch64.rpm"
RPM_HASH = "6987c8038996c45746e6a3b8dfa7e74429d24184857050302f6736fe15205343b1e9f57f61da69fd3919cf315eb3713d3fbc116bba3799139d8c5136e8a9d3c6"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-codemap \
bundled-rust-crate-colorchoice \
bundled-rust-crate-equivalent \
bundled-rust-crate-getrandom \
bundled-rust-crate-grass \
bundled-rust-crate-grass-compiler \
bundled-rust-crate-hashbrown \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-lasso \
bundled-rust-crate-libc \
bundled-rust-crate-once-cell \
bundled-rust-crate-phf \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-macros \
bundled-rust-crate-phf-shared \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-serde-core \
bundled-rust-crate-siphasher \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-zerocopy \
rust-grass"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
