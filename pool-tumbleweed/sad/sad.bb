SUMMARY = "CLI search and replace batch file editing tool"
DESCRIPTION = "Basically sad is a Batch File Edit tool. \
It will show you a really nice diff of proposed changes before you commit them. \
Unlike sed, you can double check before you fat finger your edit."
LICENSE = "(0BSD | Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & MIT & (Artistic-2.0 | CC0-1.0) & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & ISC & MIT & (MIT | Unlicense) & MPL-2.0 & MPL-2.0+ & Zlib & zlib-acknowledgement & Apache-2.0"

PV = "0.4.32"

RPM_NAME = "sad-0.4.32-1.8.aarch64.rpm"
RPM_HASH = "3180ca4138dbdb285cafaeb1fe961b6403a21108a70e9f8d04b39be098c9232171e8128df67b033a2e31a6d56d23b557b95979fc84e9be26dd2836e759dcf7bb"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-difflib \
bundled-rust-crate-either \
bundled-rust-crate-env-home \
bundled-rust-crate-errno \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-sad \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-tokio \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-which \
sad"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
