SUMMARY = "A vhost-user virtio-fs device backend written in Rust"
DESCRIPTION = "A vhost-user virtio-fs device backend written in Rust"
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "virtiofsd-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "97f4f9b697c69adb032f739c63c5c739e48f2d93add5860137b13094dc300ae4dfe857bb2c8fd1c48b741a431bed6acc7c2c83b72f5556ffa9c571221180a18f"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arc-swap \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-btree-range-map \
bundled-rust-crate-btree-slab \
bundled-rust-crate-byteorder \
bundled-rust-crate-capng \
bundled-rust-crate-cc-traits \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cobs \
bundled-rust-crate-colorchoice \
bundled-rust-crate-deranged \
bundled-rust-crate-env-logger \
bundled-rust-crate-error-chain \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-hash32 \
bundled-rust-crate-heapless \
bundled-rust-crate-heck \
bundled-rust-crate-hostname \
bundled-rust-crate-humantime \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libseccomp-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-match-cfg \
bundled-rust-crate-memchr \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-once-cell \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-postcard \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-range-traits \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-syslog \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-version-check \
bundled-rust-crate-vhost \
bundled-rust-crate-vhost-user-backend \
bundled-rust-crate-virtio-bindings \
bundled-rust-crate-virtio-queue \
bundled-rust-crate-virtiofsd \
bundled-rust-crate-vm-memory \
bundled-rust-crate-vmm-sys-util \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
virtiofsd"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
libseccomp.so.2"

inherit rpm
