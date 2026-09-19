SUMMARY = "Helper that allows Git (and shell scripts) to use KeePassXC as credential store"
DESCRIPTION = "A Git credential helper that allows Git (and shell scripts) to get/store logins from/to KeePassXC."
LICENSE = "GPL-3.0-only"

PV = "0.14.3"

RPM_NAME = "git-credential-keepassxc-0.14.3-1.4.aarch64.rpm"
RPM_HASH = "4c0d7e3d3e5d2115fbf5bf1f10477589870977569de4721cf8b0a6294eec103f107e2aaf41343b0efddd0d7889153abfd25e07442318448b9a80c539f4f22584"

RPROVIDES:${PN} += "bundled-rust-crate-aead \
bundled-rust-crate-aes-gcm \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-cipher \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-box \
bundled-rust-crate-crypto-common \
bundled-rust-crate-crypto-secretbox \
bundled-rust-crate-ctr \
bundled-rust-crate-curve25519-dalek \
bundled-rust-crate-deranged \
bundled-rust-crate-directories-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-equivalent \
bundled-rust-crate-erased-serde \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-ghash \
bundled-rust-crate-git-credential-keepassxc \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-inout \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-memchr \
bundled-rust-crate-nix \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-enum \
bundled-rust-crate-num-enum-derive \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-poly1305 \
bundled-rust-crate-polyval \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-prctl \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustversion \
bundled-rust-crate-salsa20 \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-slog \
bundled-rust-crate-slog-term \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-sysinfo \
bundled-rust-crate-tabwriter \
bundled-rust-crate-term \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-universal-hash \
bundled-rust-crate-version-check \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zeroize \
bundled-rust-crate-zmij \
git-credential-keepassxc"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
