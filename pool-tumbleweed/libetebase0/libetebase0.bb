SUMMARY = "A C shared library for Etebase"
DESCRIPTION = "Etebase is an end-to-end encrypted backend as a service. Think Firebase, but encrypted in a way that only your users can access their data. \
 \
Etebase makes it easy to build end-to-end encrypted applications by taking care of the encryption and its related challenges. It is fully open-source (clients and server) so anyone can review, audit or contribute to its development!"
LICENSE = "(Apache-2.0 | MIT) & BSD-2-Clause & BSD-3-Clause & Apache-2.0-with-LLVM-exception & CC-BY-SA-4.0 & MPL-2.0 & CC0-1.0 & (Apache-2.0 | BSL-1.0) & (GPL-2.0-or-later | MIT) & GPL-2.0-or-later-with-Autoconf-exception-3.0 & GPL-2.0-or-later-with-Libtool-exception"

PV = "0.5.8"

RPM_NAME = "libetebase0-0.5.8-1.8.aarch64.rpm"
RPM_HASH = "48f2ee4ad3d05937f74af6097554c9e9ad7fdf4e9b8dcf505b5fcdc62994fe1a0dc26fb6fc4cd9b7003e3fa0109ba33086a7c2d1611d375b9b894a0af08ea09c"

RPROVIDES:${PN} += "bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cbindgen \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-cvt \
bundled-rust-crate-displaydoc \
bundled-rust-crate-ed25519 \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-etebase \
bundled-rust-crate-fastrand \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs-at \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-tls \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indexmap \
bundled-rust-crate-ipnet \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libetebase \
bundled-rust-crate-libsodium-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mio \
bundled-rust-crate-native-tls \
bundled-rust-crate-nix \
bundled-rust-crate-normpath \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-remove-dir-all \
bundled-rust-crate-reqwest \
bundled-rust-crate-rmp \
bundled-rust-crate-rmp-serde \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-bytes \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-shlex \
bundled-rust-crate-signature \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-sodiumoxide \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-synstructure \
bundled-rust-crate-tempfile \
bundled-rust-crate-textwrap \
bundled-rust-crate-tinystr \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-native-tls \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-vcpkg \
bundled-rust-crate-vec-map \
bundled-rust-crate-walkdir \
bundled-rust-crate-want \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
libetebase.so.0 \
libetebase0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3"

inherit rpm
