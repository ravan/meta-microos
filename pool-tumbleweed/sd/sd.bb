SUMMARY = "Intuitive find & replace CLI"
DESCRIPTION = "sd uses regex syntax that you already know from JavaScript and Python. \
Forget about dealing with quirks of sed or awk - get productive immediately."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & BSD-3-Clause & MIT & (MIT | Unlicense)"

PV = "1.1.0"

RPM_NAME = "sd-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "65baaa0c5418a527688d5e98ee0582041cded50a5a8935a2a050aa70381473c7fdf071bdf0d221dc0ab3a469fd4a355a71f003784f244c83ae73ee90b0c5c380"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-once-cell \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-sd \
bundled-rust-crate-sd-cli \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
sd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
