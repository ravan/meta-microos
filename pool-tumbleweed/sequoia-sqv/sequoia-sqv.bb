SUMMARY = "A simple signature verification program"
DESCRIPTION = "sqv verifies detached OpenPGP signatures. It is a replacement for gpgv. \
Unlike gpgv, it can take additional constraints on the signature into account."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "sequoia-sqv-1.3.0-2.3.aarch64.rpm"
RPM_HASH = "92d4853d899253a321b1d90ebbae4915403d8ef34f6edf24631aae2254bf5295e694bb5b6398af930a1573e2d5d12766819c96020897f1d9587f2e7aaee340ea"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-argon2 \
bundled-rust-crate-ascii-canvas \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-base64ct \
bundled-rust-crate-bindgen \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake2 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-buffered-reader \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-either \
bundled-rust-crate-ena \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-foldhash \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
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
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-keccak \
bundled-rust-crate-lalrpop \
bundled-rust-crate-lalrpop-util \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memsec \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nettle \
bundled-rust-crate-nettle-sys \
bundled-rust-crate-new-debug-unreachable \
bundled-rust-crate-nom \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-password-hash \
bundled-rust-crate-petgraph \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-precomputed-hash \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sequoia-man \
bundled-rust-crate-sequoia-openpgp \
bundled-rust-crate-sequoia-policy-config \
bundled-rust-crate-sequoia-sqv \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-sha1collisiondetection \
bundled-rust-crate-sha3 \
bundled-rust-crate-shlex \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-string-cache \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-tempfile \
bundled-rust-crate-term \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinystr \
bundled-rust-crate-toml \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-writeable \
bundled-rust-crate-xxhash-rust \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
sequoia-sqv"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
