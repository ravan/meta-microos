SUMMARY = "git commit --fixup, but automatic"
DESCRIPTION = "A convenient git subcommand to automatically create \
fixup! commits"
LICENSE = "BSD-3-Clause"

PV = "0.6.17"

RPM_NAME = "git-absorb-0.6.17-1.9.aarch64.rpm"
RPM_HASH = "9a837bea2b33a88b5d6dcc770363f94371ccad0a4f61cb9e7966e1d0841689563dca20e9ae764e0cf982367f7fd633ba267144f804c5fde24168f3e01fbf7fba"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-complete-nushell \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-deranged \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-displaydoc \
bundled-rust-crate-errno \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-git-absorb \
bundled-rust-crate-git2 \
bundled-rust-crate-heck \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locid \
bundled-rust-crate-icu-locid-transform \
bundled-rust-crate-icu-locid-transform-data \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-icu-provider-macros \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-is-terminal \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-num-conv \
bundled-rust-crate-once-cell \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-shlex \
bundled-rust-crate-slog \
bundled-rust-crate-slog-term \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-term \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinystr \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-url \
bundled-rust-crate-utf16-iter \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
bundled-rust-crate-write16 \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
git-absorb"

RDEPENDS:${PN} += "git-core \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
