SUMMARY = "Assess compliance for cryptographic keys"
DESCRIPTION = "The wardstone project aims to create a library that can be used across different programming languages via a foreign function interface and a command line utility that users can run against their existing keys to detect conformance to varying cryptographic key standards and research publications."
LICENSE = "ISC"

PV = "0.2.0~0"

RPM_NAME = "wardstone-0.2.0~0-3.8.aarch64.rpm"
RPM_HASH = "8ed5c88bdb4cead82feb5a891aa5d91c4352599e238381a468a8233b915ccf9b14e77cf091eb9f66f9a5e63f782cd7a05425ad3966abf4f680e0f2f5b57d39f1"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-asn1-rs \
bundled-rust-crate-asn1-rs-derive \
bundled-rust-crate-asn1-rs-impl \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-byteorder \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-data-encoding \
bundled-rust-crate-der-parser \
bundled-rust-crate-deranged \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-generic-array \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-md-5 \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-oid-registry \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssh-keys \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rusticata-macros \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha2 \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-wardstone \
bundled-rust-crate-wardstone-core \
bundled-rust-crate-x509-parser \
wardstone"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3"

inherit rpm
