SUMMARY = "CLI to generate, analyze, convert and manipulate colors"
DESCRIPTION = "pastel is a command-line tool to generate, analyze, convert and manipulate \
colors. It supports many different color formats and color spaces like RGB \
(sRGB), HSL, CIELAB, CIELCh as well as ANSI 8-bit and 24-bit \
representations."
LICENSE = "Apache-2.0 & MIT"

PV = "0.12.0"

RPM_NAME = "pastel-0.12.0-1.6.aarch64.rpm"
RPM_HASH = "cd4da3f18712f9301ccf5b6c1ffe8c2f6ed17fe4207562a1de90f0c4e9eb60eb574db79ddfdc4ef872881037ff333cf1ba9a4cd69b7ac4df53aa2b7a695b2a43"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-errno \
bundled-rust-crate-getrandom \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-once-cell \
bundled-rust-crate-output-vt100 \
bundled-rust-crate-pastel \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-winapi \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
pastel"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
