SUMMARY = "Replacement for ls written in Rust"
DESCRIPTION = "eza is a modern, maintained replacement for ls, built on exa."
LICENSE = "EUPL-1.2"

PV = "0.23.5"

RPM_NAME = "eza-0.23.5-1.3.aarch64.rpm"
RPM_HASH = "80e4a5154d4ac4431f30bdbfc343f347ddcb861b6742d47274a6d775570bcde2db28e3ce934a84edc09740f66e48a5ebe11dbe71fc674db3faa211b788a6c422"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler2 \
bundled-rust-crate-ansi-width \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-approx \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-by-address \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-deranged \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-eza \
bundled-rust-crate-fast-srgb8 \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-gimli \
bundled-rust-crate-git2 \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-locale \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-natord-plus-plus \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-option-ext \
bundled-rust-crate-palette \
bundled-rust-crate-palette-derive \
bundled-rust-crate-partition-identity \
bundled-rust-crate-path-clean \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-macros \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-proc-mounts \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-norway \
bundled-rust-crate-shlex \
bundled-rust-crate-siphasher \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-timeago \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unit-prefix \
bundled-rust-crate-unsafe-libyaml-norway \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uutils-term-grid \
bundled-rust-crate-uzers \
bundled-rust-crate-vcpkg \
exa \
eza"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
