SUMMARY = "Virtual Machine Monitor for creating microVMs"
DESCRIPTION = "Firecracker is a virtualization technology for creating and managing \
multi-tenant container and function-based services."
LICENSE = "Apache-2.0"

PV = "1.16.1"

RPM_NAME = "firecracker-1.16.1-1.3.aarch64.rpm"
RPM_HASH = "b8965393cd159690e3e6e51aee59b65c983eb01716d8efc1c083dfa03c1719e6e1471c5a4a02cf5923f8068fe94e6e7b64540decdebbb380881f32b573b4ae19"

RPROVIDES:${PN} += "bundled-rust-crate-acpi-tables \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arrayvec \
bundled-rust-crate-aws-lc-rs \
bundled-rust-crate-aws-lc-sys \
bundled-rust-crate-base64 \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitcode \
bundled-rust-crate-bitcode-derive \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cmake \
bundled-rust-crate-colorchoice \
bundled-rust-crate-convert-case \
bundled-rust-crate-crc64 \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-event-manager \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-firecracker \
bundled-rust-crate-fs-extra \
bundled-rust-crate-funty \
bundled-rust-crate-getrandom \
bundled-rust-crate-glam \
bundled-rust-crate-glob \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jailer \
bundled-rust-crate-jobserver \
bundled-rust-crate-kvm-bindings \
bundled-rust-crate-kvm-ioctls \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lazycell \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linux-loader \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memfd \
bundled-rust-crate-micro-http \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-seccompiler \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-slab \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-untrusted \
bundled-rust-crate-userfaultfd \
bundled-rust-crate-userfaultfd-sys \
bundled-rust-crate-utf8parse \
bundled-rust-crate-utils \
bundled-rust-crate-uuid \
bundled-rust-crate-vhost \
bundled-rust-crate-vm-allocator \
bundled-rust-crate-vm-fdt \
bundled-rust-crate-vm-memory \
bundled-rust-crate-vm-superio \
bundled-rust-crate-vmm \
bundled-rust-crate-vmm-sys-util \
bundled-rust-crate-wyz \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zmij \
firecracker"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libseccomp.so.2"

inherit rpm
