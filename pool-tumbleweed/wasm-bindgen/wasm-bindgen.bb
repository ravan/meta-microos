SUMMARY = "Facilitating high-level interactions between Wasm modules and JavaScript"
DESCRIPTION = "Facilitating high-level interactions between Wasm modules and JavaScript. \
 \
Features \
- Lightweight. Only pay for what you use. wasm-bindgen only generates bindings \
  and glue for the JavaScript imports you actually use and Rust functionality \
  that you export. For example, importing and using the document.querySelector \
  method doesn't cause Node.prototype.appendChild or window.alert to be included \
  in the bindings as well. \
- ECMAScript modules. Just import WebAssembly modules the same way you would \
  import JavaScript modules. Future compatible with WebAssembly modules and \
  ECMAScript modules integration. \
- Designed with the 'Web IDL bindings' proposal in mind. Eventually, there \
  won't be any JavaScript shims between Rust-generated wasm functions and \
  native DOM methods. Because the Wasm functions are statically type checked, \
  some of those native methods' dynamic type checks should become unnecessary, \
  promising to unlock even-faster-than-JavaScript DOM access."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.100"

RPM_NAME = "wasm-bindgen-0.2.100-2.2.aarch64.rpm"
RPM_HASH = "3bfec1409f1023da0d081bf0d9452fb736f9eded0d7fdee745763ecc040e4119c96daff37b8eccb407b5f7cc3b6412fbe827d2e9992df7897331e041958ac0c0"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-alloc-no-stdlib \
bundled-rust-crate-alloc-stdlib \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-ascii \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-brotli-decompressor \
bundled-rust-crate-buf-redux \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chunked-transfer \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-defmt \
bundled-rust-crate-defmt-macros \
bundled-rust-crate-defmt-parser \
bundled-rust-crate-deranged \
bundled-rust-crate-displaydoc \
bundled-rust-crate-either \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fallible-iterator \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-id-arena \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-jiff-core \
bundled-rust-crate-leb128 \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mime-guess \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-multipart \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-potential-utf \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ring \
bundled-rust-crate-rouille \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-safemem \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha1-smol \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-threadpool \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tiny-http \
bundled-rust-crate-tinystr \
bundled-rust-crate-twoway \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-walrus \
bundled-rust-crate-walrus-macro \
bundled-rust-crate-wasm-bindgen-cli \
bundled-rust-crate-wasm-bindgen-cli-support \
bundled-rust-crate-wasm-bindgen-externref-xform \
bundled-rust-crate-wasm-bindgen-multi-value-xform \
bundled-rust-crate-wasm-bindgen-shared \
bundled-rust-crate-wasm-bindgen-threads-xform \
bundled-rust-crate-wasm-bindgen-wasm-conventions \
bundled-rust-crate-wasm-bindgen-wasm-interpreter \
bundled-rust-crate-wasm-encoder \
bundled-rust-crate-wasmparser \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-writeable \
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
wasm-bindgen"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
