SUMMARY = "Thin Provisioning Tools"
DESCRIPTION = "A suite of tools for thin provisioning on Linux."
LICENSE = "Apache-2.0 & GPL-3.0-only & MIT & MPL-2.0 & Unicode-3.0"

PV = "1.3.3"

RPM_NAME = "thin-provisioning-tools-1.3.3-2.2.aarch64.rpm"
RPM_HASH = "a206f746db8c86b35183fd31521a5cffeff477641d13094f8ed5a95fa66a9081eb71d0b7c7f07208e4c86fd77a96bbef9893de677373cc0bfe5f7cee176e79ea"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-approx \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-by-address \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-castaway \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-console \
bundled-rust-crate-crc32c \
bundled-rust-crate-crc32fast \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-data-encoding \
bundled-rust-crate-defmt \
bundled-rust-crate-defmt-macros \
bundled-rust-crate-defmt-parser \
bundled-rust-crate-deranged \
bundled-rust-crate-devicemapper \
bundled-rust-crate-devicemapper-sys \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-exitcode \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-flate2 \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-ident-case \
bundled-rust-crate-indicatif \
bundled-rust-crate-indoc \
bundled-rust-crate-instability \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-iovec \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-jiff-core \
bundled-rust-crate-kasuari \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libm \
bundled-rust-crate-libudev-sys \
bundled-rust-crate-line-clipping \
bundled-rust-crate-log \
bundled-rust-crate-lru \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-numtoa \
bundled-rust-crate-palette \
bundled-rust-crate-palette-derive \
bundled-rust-crate-palette-math \
bundled-rust-crate-pkg-config \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rangemap \
bundled-rust-crate-ratatui \
bundled-rust-crate-ratatui-core \
bundled-rust-crate-ratatui-termion \
bundled-rust-crate-ratatui-widgets \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-retry \
bundled-rust-crate-roaring \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-termion \
bundled-rust-crate-thinp \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-udev \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unit-prefix \
bundled-rust-crate-utf8parse \
bundled-rust-crate-zerocopy \
thin-provisioning-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libudev.so.1"

inherit rpm
