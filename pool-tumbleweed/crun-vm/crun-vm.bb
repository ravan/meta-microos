SUMMARY = "OCI Runtime that enables to run VM images"
DESCRIPTION = "crun-vm is an OCI Runtime that enables Podman, Docker, and Kubernetes to run QEMU-compatible Virtual Machine (VM) images. This means you can: \
 \
    Run VMs as easily as you run containers. \
    Manage containers and VMs together using the same standard tooling."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "crun-vm-0.3.0-1.9.aarch64.rpm"
RPM_HASH = "39474ce20e2d55078a291724fca819db3623f653cd501e2f5e38426bea7d2c72dcb6c0844e5e727e605d396710b08135457e73d115335cea51f764f7f85db531"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bytes \
bundled-rust-crate-camino \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crun-vm \
bundled-rust-crate-crypto-common \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-derive-builder \
bundled-rust-crate-derive-builder-core \
bundled-rust-crate-derive-builder-macro \
bundled-rust-crate-digest \
bundled-rust-crate-equivalent \
bundled-rust-crate-fnv \
bundled-rust-crate-generic-array \
bundled-rust-crate-getset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-liboci-cli \
bundled-rust-crate-memchr \
bundled-rust-crate-minidom \
bundled-rust-crate-nix \
bundled-rust-crate-num-cpus \
bundled-rust-crate-oci-spec \
bundled-rust-crate-once-cell \
bundled-rust-crate-proc-macro-error-attr2 \
bundled-rust-crate-proc-macro-error2 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rust-embed \
bundled-rust-crate-rust-embed-impl \
bundled-rust-crate-rust-embed-utils \
bundled-rust-crate-rustversion \
bundled-rust-crate-rxml \
bundled-rust-crate-rxml-validation \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha2 \
bundled-rust-crate-smartstring \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-urlencoding \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-xml-rs \
crun-vm"

RDEPENDS:${PN} += "crun \
libc.so.6 \
libgcc-s.so.1 \
libselinux.so.1 \
xorriso"

inherit rpm
