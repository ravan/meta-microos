SUMMARY = "Installer for CoreOS disk images"
DESCRIPTION = "coreos-installer is a program to assist with installing Fedora CoreOS (FCOS) and \
Red Hat Enterprise Linux CoreOS (RHCOS). It can do the following: \
 \
* Install the operating system to a target disk, optionally customizing it with \
  an Ignition config or first-boot kernel parameters (coreos-installer install) \
* Download and verify an operating system image for various cloud, \
  virtualization, or bare metal platforms (coreos-installer download) \
* List Fedora CoreOS images available for download \
  (coreos-installer list-stream) \
* Embed an Ignition config in a live ISO image to customize the running system \
  that boots from it (coreos-installer iso ignition) \
* Wrap an Ignition config in an initrd image that can be appended to the live \
* PXE initramfs to customize the running system that boots from it \
  (coreos-installer pxe ignition) \
 \
The options available for each subcommand are available in the Command Line \
Reference or via the --help option. \
 \
Take a look at the [Getting Started \
Guide](https://github.com/coreos/coreos-installer/blob/main/docs/getting-started.md) \
for more information regarding how to download and use coreos-installer."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "coreos-installer-0.26.0-1.5.aarch64.rpm"
RPM_HASH = "6eea260330967e8078163dec37b2cbbc7b15c294a71bb9741a5379a6a2f733bece7ef506baaa8b3a8d88084812652241b1d8b3ec6041951feb19e9ad0c7ef1d2"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-borsh \
bundled-rust-crate-borsh-derive \
bundled-rust-crate-byte-unit \
bundled-rust-crate-bytecheck \
bundled-rust-crate-bytecheck-derive \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-coreos-installer \
bundled-rust-crate-cpio \
bundled-rust-crate-crc \
bundled-rust-crate-crc-catalog \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-endi \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-funty \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-gptman \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-body-util \
bundled-rust-crate-httparse \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-rustls \
bundled-rust-crate-hyper-tls \
bundled-rust-crate-hyper-util \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-ident-case \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-ignition-config \
bundled-rust-crate-indexmap \
bundled-rust-crate-ipnet \
bundled-rust-crate-iri-string \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-lzma-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-native-tls \
bundled-rust-crate-nix \
bundled-rust-crate-nmstate \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pipe \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-ptr-meta \
bundled-rust-crate-ptr-meta-derive \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rend \
bundled-rust-crate-reqwest \
bundled-rust-crate-ring \
bundled-rust-crate-rkyv \
bundled-rust-crate-rkyv-derive \
bundled-rust-crate-roff \
bundled-rust-crate-rust-decimal \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-schemars \
bundled-rust-crate-seahash \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-ignored \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-serde-with \
bundled-rust-crate-serde-with-macros \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha1-smol \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-synstructure \
bundled-rust-crate-tap \
bundled-rust-crate-tempfile \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinystr \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-native-tls \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-tower \
bundled-rust-crate-tower-http \
bundled-rust-crate-tower-layer \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8-width \
bundled-rust-crate-uuid \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-want \
bundled-rust-crate-winnow \
bundled-rust-crate-writeable \
bundled-rust-crate-wyz \
bundled-rust-crate-xz2 \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
coreos-installer"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libzstd.so.1"

inherit rpm
