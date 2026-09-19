SUMMARY = "NGINX module for automatic certificate management (ACMEv2)"
DESCRIPTION = "Nginx-acme is an NGINX module implementation of the automatic \
certificate management (ACMEv2) protocol. \
 \
The module implements the following specifications: \
 \
* RFC8555 (Automatic Certificate Management Environment) with \
  limitations: Only HTTP-01 challenge type is supported \
* RFC8737 (ACME TLS Application-Layer Protocol Negotiation (ALPN) \
  Challenge Extension) \
* RFC8738 (ACME IP Identifier Validation Extension)"
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "nginx-module-acme-0.4.1-1.10.aarch64.rpm"
RPM_HASH = "990455664e70753917d81ee1332ebba4a66a993b28daef7697635036c9c02b76d7ef401e654e0c2c3b735e2aede36e7804ee8577ba77f644a084f9dea9345adb"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-annotate-snippets \
bundled-rust-crate-anstyle \
bundled-rust-crate-async-task \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-base64 \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-constcat \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-glob \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-body-util \
bundled-rust-crate-http-serde \
bundled-rust-crate-httparse \
bundled-rust-crate-hyper \
bundled-rust-crate-iri-string \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nginx-acme \
bundled-rust-crate-nginx-sys \
bundled-rust-crate-ngx \
bundled-rust-crate-nom \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallvec \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vcpkg \
bundled-rust-crate-want \
bundled-rust-crate-zeroize \
bundled-rust-crate-zmij \
nginx-module-acme"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
nginx"

inherit rpm
