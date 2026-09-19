SUMMARY = "BTF introspection tool"
DESCRIPTION = "BPF Type Format information and data introspection tool. It dumps BTF types in various formats."
LICENSE = "BSD-2-Clause"

PV = "0.0.4~0"

RPM_NAME = "btfdump-0.0.4~0-1.10.aarch64.rpm"
RPM_HASH = "36422fffe0c5e623540b086515f735825b081a54447080802fe8b4a4e35de844a6a6b3ef82fa644cec90bb4514cc40db5ba7fc5aa043c31b155b8c3bef599f46"

RPROVIDES:${PN} += "btfdump \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-btfdump \
bundled-rust-crate-byteorder \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-derive-more \
bundled-rust-crate-errno \
bundled-rust-crate-flate2 \
bundled-rust-crate-goblin \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-object \
bundled-rust-crate-plain \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ruzstd \
bundled-rust-crate-scroll \
bundled-rust-crate-scroll-derive \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-twox-hash \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
