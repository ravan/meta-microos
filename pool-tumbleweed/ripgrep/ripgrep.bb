SUMMARY = "A search tool that combines ag with grep"
DESCRIPTION = "ripgrep is a line oriented search tool that combines the usability of \
The Silver Searcher (similar to ack) with the raw speed of GNU grep. \
ripgrep works by recursively searching your current directory \
for a regex pattern."
LICENSE = "MIT & Unlicense"

PV = "15.2.0"

RPM_NAME = "ripgrep-15.2.0-1.3.aarch64.rpm"
RPM_HASH = "bc6b22cbc80c2fd8ea940ba09c33815c76e9ce57fba87a3b290a12de0b1642e39853e757292ae10b7d750291e7e4545936ce6106bd656e49f75a0e10830e6869"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-globset \
bundled-rust-crate-grep \
bundled-rust-crate-grep-cli \
bundled-rust-crate-grep-matcher \
bundled-rust-crate-grep-pcre2 \
bundled-rust-crate-grep-printer \
bundled-rust-crate-grep-regex \
bundled-rust-crate-grep-searcher \
bundled-rust-crate-ignore \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lexopt \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-pcre2 \
bundled-rust-crate-pcre2-sys \
bundled-rust-crate-pkg-config \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ripgrep \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-walkdir \
bundled-rust-crate-zmij \
ripgrep"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libpcre2-8.so.0"

inherit rpm
