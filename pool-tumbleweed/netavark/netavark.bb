SUMMARY = "Container network stack"
DESCRIPTION = "Netavark is a rust based network stack for containers. It is being \
designed to work with Podman but is also applicable for other OCI \
container management applications. \
 \
Its features include: \
* Configuration of container networks via JSON configuration file \
* Creation and management of required network interfaces, including MACVLAN networks \
* All required firewall configuration to perform NAT and port forwarding as required for containers \
* Support for firewalld and nftables \
* Support for rootless containers \
* Support for IPv4 and IPv6 \
* Support for container DNS resolution via the aardvark-dns project"
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "netavark-2.0.0-1.3.aarch64.rpm"
RPM_HASH = "dc70faa35cbe6105b72e5d7a0291978a220a21cccf9a53b596223df04037e33257509cd5d20d7e36dbefd9b828ea917ebd40db9ed4269c7e29c668f7b5403b5f"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-async-broadcast \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-process \
bundled-rust-crate-async-recursion \
bundled-rust-crate-async-signal \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-axum \
bundled-rust-crate-axum-core \
bundled-rust-crate-base16ct \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blocking \
bundled-rust-crate-bs58 \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chacha20 \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-const-oid \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-digest \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-either \
bundled-rust-crate-endi \
bundled-rust-crate-enumflags2 \
bundled-rust-crate-enumflags2-derive \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-etherparse \
bundled-rust-crate-event-listener \
bundled-rust-crate-event-listener-strategy \
bundled-rust-crate-fastrand \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-fs2 \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-body-util \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hybrid-array \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-timeout \
bundled-rust-crate-hyper-util \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-matchit \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mime \
bundled-rust-crate-mio \
bundled-rust-crate-mozim \
bundled-rust-crate-multimap \
bundled-rust-crate-netavark \
bundled-rust-crate-netlink-packet-core \
bundled-rust-crate-netlink-packet-route \
bundled-rust-crate-netlink-sys \
bundled-rust-crate-nftables \
bundled-rust-crate-nix \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-stream \
bundled-rust-crate-parking \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-petgraph \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-piper \
bundled-rust-crate-polling \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-prost \
bundled-rust-crate-prost-build \
bundled-rust-crate-prost-derive \
bundled-rust-crate-prost-types \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-pulldown-cmark-to-cmark \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-ref-cast \
bundled-rust-crate-ref-cast-impl \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-schemars \
bundled-rust-crate-schemars-derive \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-derive-internals \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-path-to-error \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-with \
bundled-rust-crate-serde-with-macros \
bundled-rust-crate-sha2 \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-tonic \
bundled-rust-crate-tonic-build \
bundled-rust-crate-tonic-prost \
bundled-rust-crate-tonic-prost-build \
bundled-rust-crate-tower \
bundled-rust-crate-tower-layer \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-typenum \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-want \
bundled-rust-crate-winnow \
bundled-rust-crate-zbus \
bundled-rust-crate-zbus-macros \
bundled-rust-crate-zbus-names \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zmij \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
netavark"

RDEPENDS:${PN} += "/usr/bin/sh \
aardvark-dns \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
nftables"

inherit rpm
