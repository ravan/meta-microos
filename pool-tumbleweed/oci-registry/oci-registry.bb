SUMMARY = "OCI Registry with filesystem and S3 storage back-ends"
DESCRIPTION = "oci-registry is an implementation of the OCI Registry spec with filesystem and \
S3 storage back-ends. \
 \
Features \
- Pull-through cache for any registry, not just docker.io \
  - This includes private, authenticated registries. This means that you can \
    create an unauthenticated mirror of a private registry and expose it to the \
    Internet. Easily. Don't do that. \
- Two storage back-ends \
  - S3 \
  - Local filesystem \
- Small footprint; in my test system, the official registry uses approximately \
  130 MiB of memory to mirror docker.io; five replicas of oci-registry combined \
  use approximately 60 MiB to mirror everything in example.yaml, plus one private \
  registry. CPU is negligible for both. \
 \
Limitations \
- Pushing is not currently implemented; oci-registry only supports being a \
  pull-through cache (a mirror) at this time. Push support is planned. \
- Authentication is not currently implemented, but is planned \
- Only SHA256 content hashes are supported, but supporting other schemes is \
  planned \
- Connecting to oci-registry with TLS (https) is not supported and support will \
  not be added. \
  - Using nginx as a TLS termination proxy is easy, well-supported, and \
    well-documented; if you require TLS between the client and oci-registry, \
    that is the recommended configuration \
  - Connecting to upstream registries with TLS is supported, recommended, and \
    usually required. \
- If two clients request the same blob simultaneously, it will be downloaded \
  from upstream twice in parallel instead of having the later request wait for \
  the download to finish, then serve it from cache. There are no data corruption \
  issues, but it is suboptimal. No fix is currently planned, but I'm open to one. \
- Has not yet had the OCI distribution spec conformance test suite run against \
  it; only manual compatibility testing with docker and containerd has been \
  performed. This is planned after push support is implemented."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "oci-registry-0.4.5-1.11.aarch64.rpm"
RPM_HASH = "bbec99394990705d2cb5165b3c199b5f43019891d1c48a7ab15655da723419fb5826dce6b65460aec585f753497e3a6fe6cf1a0cce5d4bc819db447e9599d722"

RPROVIDES:${PN} += "bundled-rust-crate-actix-codec \
bundled-rust-crate-actix-http \
bundled-rust-crate-actix-macros \
bundled-rust-crate-actix-router \
bundled-rust-crate-actix-rt \
bundled-rust-crate-actix-server \
bundled-rust-crate-actix-service \
bundled-rust-crate-actix-utils \
bundled-rust-crate-actix-web \
bundled-rust-crate-actix-web-codegen \
bundled-rust-crate-actix-web-prometheus \
bundled-rust-crate-adler2 \
bundled-rust-crate-adler32 \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-alloc-no-stdlib \
bundled-rust-crate-alloc-stdlib \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arcerror \
bundled-rust-crate-arcstr \
bundled-rust-crate-async-broadcast \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-fs \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-stream \
bundled-rust-crate-async-stream-impl \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-async-walkdir \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blocking \
bundled-rust-crate-brotli \
bundled-rust-crate-brotli-decompressor \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-bytestring \
bundled-rust-crate-camino \
bundled-rust-crate-castaway \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-compact-str \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-convert-case \
bundled-rust-crate-cookie \
bundled-rust-crate-cow-utils \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-crypto-mac \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-more \
bundled-rust-crate-digest \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-dkregistry \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-event-listener \
bundled-rust-crate-event-listener-strategy \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hmac \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-humantime \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-rustls \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-idna \
bundled-rust-crate-impl-more \
bundled-rust-crate-indexmap \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-language-tags \
bundled-rust-crate-lazy-regex \
bundled-rust-crate-lazy-regex-proc-macros \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libflate \
bundled-rust-crate-libflate-lz77 \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-local-channel \
bundled-rust-crate-local-waker \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-md-5 \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-traits \
bundled-rust-crate-oci-registry \
bundled-rust-crate-once-cell \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-overload \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-piper \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procfs \
bundled-rust-crate-procfs-core \
bundled-rust-crate-prometheus \
bundled-rust-crate-quanta \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-lite \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-reqwest \
bundled-rust-crate-ring \
bundled-rust-crate-rle-decode-fast \
bundled-rust-crate-rusoto-core \
bundled-rust-crate-rusoto-credential \
bundled-rust-crate-rusoto-s3 \
bundled-rust-crate-rusoto-signature \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sct \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-ignored \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-serde-with \
bundled-rust-crate-serde-with-macros \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha1 \
bundled-rust-crate-sha2 \
bundled-rust-crate-sha2-asm \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket-address \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-tar \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tikv-jemalloc-sys \
bundled-rust-crate-tikv-jemallocator \
bundled-rust-crate-tikv-jemallocator-global \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-util \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-try-lock \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-waker-fn \
bundled-rust-crate-want \
bundled-rust-crate-webpki \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-xattr \
bundled-rust-crate-xml-rs \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
oci-registry"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
