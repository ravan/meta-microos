SUMMARY = "Byte stream conversion utility"
DESCRIPTION = "Command line byte encoding swiss army knife. \
The goal is to be the iconv of byte stream encodings. \
 \
Have you ever spent precious time converting something \
like 0xde, 0xad,\\r\\n0xbe, 0xef to \\xde\\xad\\xbe\\xef ? \
If so, then xer is for you."
LICENSE = "GPL-3.0-only"

PV = "0.0.6"

RPM_NAME = "xer-0.0.6-1.4.aarch64.rpm"
RPM_HASH = "cb88d8f94ca46b477f1e3a0b29030aa61f3036c8ed7699f3e839b89fb70672d60d8306b72237b86f80341bf0bc90dd51b075ea5de471a44dafc16d82abca4a83"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-memchr \
bundled-rust-crate-nom \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-xer \
xer"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
