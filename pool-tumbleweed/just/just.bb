SUMMARY = "Commmand runner"
DESCRIPTION = "Just is a command runner. Although it shares \
some similarities with 'make', it is not a build \
system."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.58.0"

RPM_NAME = "just-1.58.0-1.2.aarch64.rpm"
RPM_HASH = "0b79b8d7394f535c5c9a5c2a93ef71769ba0e5de22f37f241b861696fcafde0bc2ca165973ff0428234dc189b49c0d0e4e5dd72455bf5727b410c546a3c088ed"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-camino \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-const-oid \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-digest-io \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dotenvy \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hybrid-array \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-is-executable \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-just \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha2 \
bundled-rust-crate-shellexpand \
bundled-rust-crate-shlex \
bundled-rust-crate-similar \
bundled-rust-crate-snafu \
bundled-rust-crate-snafu-derive \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-terminal-size \
bundled-rust-crate-typed-arena \
bundled-rust-crate-typenum \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-zmij \
just"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
