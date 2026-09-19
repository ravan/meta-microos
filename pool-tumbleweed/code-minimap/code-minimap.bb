SUMMARY = "A high performance code minimap render"
DESCRIPTION = "Code-minimap is a tool for generating text minimaps at high speed."
LICENSE = "MIT | Apache-2.0"

PV = "0.6.8"

RPM_NAME = "code-minimap-0.6.8-1.10.aarch64.rpm"
RPM_HASH = "ae2cd2d1e12e96ac7c5f119592d2692c880deec29f14ddc96c750c05a903dea96fb886c7177b73ca44700e08e6090b8519d6b48bfce8106ec3f9933c903c38b4"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-bitflags \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-code-minimap \
bundled-rust-crate-colorchoice \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
code-minimap"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
