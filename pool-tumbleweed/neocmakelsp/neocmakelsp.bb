SUMMARY = "CMake LSP implementation based on Tower and Tree-sitter"
DESCRIPTION = "NeoCmakeLSP is another Cmake LSP. It differs from other LSP implementations as it uses \
TreeSitter and Tower, crates that are written in Rust. \
 \
It provides the following features such as: \
* Intelligent Code Completion: Provides precise code completions by analyzing CMake files, enhancing development efficiency. \
* Real-time Error Detection: Integrates linting functionality to check for potential issues in your code, help maintaining code quality. \
* Support for Neovim, Emacs, VSCode, Helix: Compatible with these popular editors, catering to diverse developer needs. \
* Simple Configuration: Easy to set up and use, minimizing configuration time so you can focus on development. \
* CLI Integration: Not only an LSP, but also includes command-line tools for code formatting, making it convenient for different environments."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "neocmakelsp-0.9.0-1.5.aarch64.rpm"
RPM_HASH = "13cdbff8bbc964df9ee89660e4351184ae728fe2c7445276f90c48809b742d05101221da9eddc1b5f03fcc9210dfe51f5081dcab7ecd0073201dab275da96e9d"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-auto-impl \
bundled-rust-crate-bitflags \
bundled-rust-crate-borrow-or-share \
bundled-rust-crate-bstr \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cli-table \
bundled-rust-crate-cli-table-derive \
bundled-rust-crate-colorchoice \
bundled-rust-crate-const-random \
bundled-rust-crate-const-random-macro \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crunchy \
bundled-rust-crate-csv \
bundled-rust-crate-csv-core \
bundled-rust-crate-dashmap \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dlv-list \
bundled-rust-crate-equivalent \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fluent-uri \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-httparse \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-executable \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lsp-types-f \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-neocmakelsp \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-ordered-multimap \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pathdiff \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rust-ini \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-streaming-iterator \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tiny-keccak \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-tower \
bundled-rust-crate-tower-layer \
bundled-rust-crate-tower-lsp-f \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-tree-sitter \
bundled-rust-crate-tree-sitter-cmake \
bundled-rust-crate-tree-sitter-language \
bundled-rust-crate-treesitter-kind-collector \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow \
neocmakelsp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
