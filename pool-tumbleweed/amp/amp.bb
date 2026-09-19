SUMMARY = "A modal text editor for the terminal"
DESCRIPTION = "Text editor written in Rust, that aims to take the core interaction model of Vim, \
simplify it, and bundle in the essential features required for a modern text editor."
LICENSE = "GPL-3.0-only"

PV = "0.7.1"

RPM_NAME = "amp-0.7.1-2.6.aarch64.rpm"
RPM_HASH = "cb37026331bab9371679332379b3926058019037f3cdb1be79327aa41d479f6d613ba3b05d4fc0583029bd0631ecaff26dc60471eeec238ef85e60310147df20"

RPROVIDES:${PN} += "amp \
bundled-rust-crate-addr2line \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-amp \
bundled-rust-crate-app-dirs2 \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-bloodhound \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cli-clipboard \
bundled-rust-crate-crc32fast \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-new \
bundled-rust-crate-displaydoc \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-error-chain \
bundled-rust-crate-fancy-regex \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fragment \
bundled-rust-crate-gethostname \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-git2 \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indexmap \
bundled-rust-crate-iovec \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-luthor \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-net2 \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-conv \
bundled-rust-crate-numtoa \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-onig \
bundled-rust-crate-onig-sys \
bundled-rust-crate-os-pipe \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-petgraph \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-potential-utf \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-scribe \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-syntect \
bundled-rust-crate-tempfile \
bundled-rust-crate-termion \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinystr \
bundled-rust-crate-tree-magic-mini \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-commons \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wl-clipboard-rs \
bundled-rust-crate-writeable \
bundled-rust-crate-x11-clipboard \
bundled-rust-crate-x11rb \
bundled-rust-crate-x11rb-protocol \
bundled-rust-crate-xdg \
bundled-rust-crate-xml-rs \
bundled-rust-crate-yaml-rust \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
