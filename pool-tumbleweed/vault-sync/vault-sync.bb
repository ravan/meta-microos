SUMMARY = "Synchronize secrets between HashiCorp Vault instances"
DESCRIPTION = "A poor man's tool to replicate secrets from one Vault instance to another. \
 \
How it works \
 \
When vault-sync starts, it does a full copy of the secrets from the source \
Vault instance to the destination Vault instance. Periodically, vault-sync does \
a full reconciliation to make sure all the destination secrets are up to date. \
 \
At the same time, you can manually enable the Socket Audit Device for the \
source Vault, so Vault will be sending audit logs to vault-sync. Using these \
audit logs, vault-sync keeps the secrets in the destination Vault up to date. \
Note that vault-sync does not create or delete the audit devices by itself. \
 \
It is possible to use the same Vault instance as the source and the \
destination. You can use this feature to replicate a 'folder' of secrets to \
another 'folder' on the same server. You need to specify different prefixes \
(src.prefix and dst.prefix) in the configuration file to make sure the source \
and the destination do not overlap."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "vault-sync-0.11.0-1.8.aarch64.rpm"
RPM_HASH = "e93b8c4df3da02bf6efd4126f2deb5232b41c19e6a7d2e8d1517744933bca6a354df91981044845c13c429aa503ecfd4f117bea0ea83e5ccbc4b897dc3ba6606"

RPROVIDES:${PN} += "bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-ctrlc \
bundled-rust-crate-deranged \
bundled-rust-crate-displaydoc \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hashicorp-vault \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-tls \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locid \
bundled-rust-crate-icu-locid-transform \
bundled-rust-crate-icu-locid-transform-data \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-icu-provider-macros \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indexmap \
bundled-rust-crate-ipnet \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mio \
bundled-rust-crate-native-tls \
bundled-rust-crate-nix \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-reqwest \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shlex \
bundled-rust-crate-simplelog \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-synstructure \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinystr \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-native-tls \
bundled-rust-crate-tokio-util \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-url \
bundled-rust-crate-utf16-iter \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-vault-sync \
bundled-rust-crate-vcpkg \
bundled-rust-crate-vec-map \
bundled-rust-crate-want \
bundled-rust-crate-write16 \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
config-vault-sync \
vault-sync"

RDEPENDS:${PN} += "/usr/bin/sh \
group-vault-sync \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
user-vault-sync"

inherit rpm
