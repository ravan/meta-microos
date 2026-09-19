SUMMARY = "Command-line interface for basic Vulkan APIs"
DESCRIPTION = "A command-line program used to interface with basic Vulkan APIs."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "vulkan-helper-0.1.0-1.6.aarch64.rpm"
RPM_HASH = "c4e03529fb3c848cdc85c5a8bab5b254d1f0901fd318451a075650b715e42651f423ce0da82c240a3c9f8af0a9a3ba4c45546b3855c962f7dc6ab32de44fe664"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-ash \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-memchr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vulkan-helper \
vulkan-helper"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
