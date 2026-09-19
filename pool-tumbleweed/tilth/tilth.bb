SUMMARY = "Tree-sitter indexed code lookups for humans and AI agents"
DESCRIPTION = "tilth indexes a source tree with tree-sitter and answers structural \
queries about it - definitions, references, call sites and file \
overviews - instead of dumping whole files. It is usable directly from \
the command line and as an MCP server, which cuts the token cost of \
letting an AI agent read a code base."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & Zlib"

PV = "0.10.1"

RPM_NAME = "tilth-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "5aa7174dcb4cdab5e073f341c113c73d0063ee90d59118be768db6b2b201867463b003320bd2a91c91b8f7689c47a082c791ed59f945db2558f8b0db1fe9520c"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-dashmap \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastbloom \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-globset \
bundled-rust-crate-grep-matcher \
bundled-rust-crate-grep-regex \
bundled-rust-crate-grep-searcher \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-multiversion-no-op \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-shlex \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallvec \
bundled-rust-crate-streaming-iterator \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tilth \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-tree-sitter \
bundled-rust-crate-tree-sitter-bash \
bundled-rust-crate-tree-sitter-c \
bundled-rust-crate-tree-sitter-c-sharp \
bundled-rust-crate-tree-sitter-cpp \
bundled-rust-crate-tree-sitter-elixir \
bundled-rust-crate-tree-sitter-go \
bundled-rust-crate-tree-sitter-java \
bundled-rust-crate-tree-sitter-javascript \
bundled-rust-crate-tree-sitter-kotlin-ng \
bundled-rust-crate-tree-sitter-language \
bundled-rust-crate-tree-sitter-md \
bundled-rust-crate-tree-sitter-php \
bundled-rust-crate-tree-sitter-python \
bundled-rust-crate-tree-sitter-ruby \
bundled-rust-crate-tree-sitter-rust \
bundled-rust-crate-tree-sitter-scala \
bundled-rust-crate-tree-sitter-swift \
bundled-rust-crate-tree-sitter-typescript \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zmij \
tilth"

RDEPENDS:${PN} += "git-core \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
