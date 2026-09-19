SUMMARY = "A syntax-aware git merge driver"
DESCRIPTION = "Mergiraf can solve a wide range of Git merge conflicts. \
That's because it's aware of the trees in your files! \
 \
Thanks to its understanding of your language, it can often \
reconcile the needs of both sides."
LICENSE = "GPL-3.0-or-later"

PV = "0.19.1"

RPM_NAME = "mergiraf-0.19.1-1.1.aarch64.rpm"
RPM_HASH = "70c8df048f0eaa88c109e244edf9d280dfef529deef0c46d203914a3bd079d8992f030d8637db2d5bb2952fbaa31182cdd5a5afa7ce1bcff63addb3e83992c15"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bumpalo \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-diffy-imara \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-etcetera \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-flate2 \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-imara-diff \
bundled-rust-crate-indexmap \
bundled-rust-crate-integer-sqrt \
bundled-rust-crate-is-terminal \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mergiraf \
bundled-rust-crate-nonempty-collections \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-oneshot \
bundled-rust-crate-pathfinding \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-semver \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-stderrlog \
bundled-rust-crate-streaming-iterator \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tree-edit-distance \
bundled-rust-crate-tree-sitter \
bundled-rust-crate-tree-sitter-bash \
bundled-rust-crate-tree-sitter-c \
bundled-rust-crate-tree-sitter-c-sharp \
bundled-rust-crate-tree-sitter-cmake \
bundled-rust-crate-tree-sitter-cpp \
bundled-rust-crate-tree-sitter-dart-orchard \
bundled-rust-crate-tree-sitter-devicetree \
bundled-rust-crate-tree-sitter-elixir \
bundled-rust-crate-tree-sitter-erlang \
bundled-rust-crate-tree-sitter-fortran \
bundled-rust-crate-tree-sitter-gleam \
bundled-rust-crate-tree-sitter-go \
bundled-rust-crate-tree-sitter-gomod-orchard \
bundled-rust-crate-tree-sitter-gosum-orchard \
bundled-rust-crate-tree-sitter-haskell \
bundled-rust-crate-tree-sitter-hcl \
bundled-rust-crate-tree-sitter-html \
bundled-rust-crate-tree-sitter-ini \
bundled-rust-crate-tree-sitter-java-orchard \
bundled-rust-crate-tree-sitter-javascript \
bundled-rust-crate-tree-sitter-json \
bundled-rust-crate-tree-sitter-kotlin-ng \
bundled-rust-crate-tree-sitter-language \
bundled-rust-crate-tree-sitter-lua \
bundled-rust-crate-tree-sitter-make \
bundled-rust-crate-tree-sitter-matlab \
bundled-rust-crate-tree-sitter-md \
bundled-rust-crate-tree-sitter-nix \
bundled-rust-crate-tree-sitter-ocaml \
bundled-rust-crate-tree-sitter-php \
bundled-rust-crate-tree-sitter-properties \
bundled-rust-crate-tree-sitter-python-orchard \
bundled-rust-crate-tree-sitter-r \
bundled-rust-crate-tree-sitter-requirements \
bundled-rust-crate-tree-sitter-ruby \
bundled-rust-crate-tree-sitter-rust-orchard \
bundled-rust-crate-tree-sitter-scala \
bundled-rust-crate-tree-sitter-scheme \
bundled-rust-crate-tree-sitter-solidity \
bundled-rust-crate-tree-sitter-starlark \
bundled-rust-crate-tree-sitter-systemverilog \
bundled-rust-crate-tree-sitter-toml-ng \
bundled-rust-crate-tree-sitter-typescript \
bundled-rust-crate-tree-sitter-xml \
bundled-rust-crate-tree-sitter-yaml \
bundled-rust-crate-typed-arena \
bundled-rust-crate-typed-path \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zip \
bundled-rust-crate-zlib-rs \
bundled-rust-crate-zmij \
bundled-rust-crate-zopfli \
mergiraf"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
