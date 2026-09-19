SUMMARY = "A modern OCR engine written in Rust"
DESCRIPTION = "ocrs is CLI tool for extracting text from images, also known as OCR \
(Optical Character Recognition)."
LICENSE = "Apache-2.0 & MIT"

PV = "0.12.1"

RPM_NAME = "ocrs-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "c8eeaaa8ca2f52dcd6160b7c38d4960fddbab269a17dfc7d5ca5b74ed87de67b7fe241fd3348da02f7a72d520f3ac1a57f2940665b74fa3e065a857fd16196ac"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-anyhow \
bundled-rust-crate-arboard \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder-lite \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-displaydoc \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-fax \
bundled-rust-crate-fax-derive \
bundled-rust-crate-fdeflate \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flatbuffers \
bundled-rust-crate-flate2 \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-gethostname \
bundled-rust-crate-getrandom \
bundled-rust-crate-half \
bundled-rust-crate-home \
bundled-rust-crate-http \
bundled-rust-crate-httparse \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-image \
bundled-rust-crate-image-webp \
bundled-rust-crate-itoa \
bundled-rust-crate-lexopt \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-moxcms \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-ocrs \
bundled-rust-crate-ocrs-cli \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-png \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pxfm \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-ring \
bundled-rust-crate-rten \
bundled-rust-crate-rten-base \
bundled-rust-crate-rten-gemm \
bundled-rust-crate-rten-imageproc \
bundled-rust-crate-rten-model-file \
bundled-rust-crate-rten-shape-inference \
bundled-rust-crate-rten-simd \
bundled-rust-crate-rten-tensor \
bundled-rust-crate-rten-vecmath \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-tinystr \
bundled-rust-crate-typeid \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-ureq-proto \
bundled-rust-crate-url \
bundled-rust-crate-utf-8 \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-weezl \
bundled-rust-crate-writeable \
bundled-rust-crate-x11rb \
bundled-rust-crate-x11rb-protocol \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
bundled-rust-crate-zmij \
bundled-rust-crate-zune-core \
bundled-rust-crate-zune-jpeg \
ocrs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
