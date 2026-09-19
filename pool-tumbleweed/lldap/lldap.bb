SUMMARY = "Light LDAP implementation"
DESCRIPTION = "This project is a lightweight authentication server that provides an \
opinionated, simplified LDAP interface for authentication. It integrates with \
many backends, from KeyCloak to Authelia to Nextcloud and more! \
 \
It comes with a frontend that makes user management easy, and allows users to \
edit their own details or reset their password by email. \
 \
The goal is not to provide a full LDAP server; if you're interested in that, \
check out OpenLDAP. This server is a user management system that is: \
 \
- simple to setup (no messing around with slapd), \
- simple to manage (friendly web UI), \
- low resources, \
- opinionated with basic defaults so you don't have to understand the \
  subtleties of LDAP. \
 \
It mostly targets self-hosting servers, with open-source components like \
Nextcloud, Airsonic and so on that only support LDAP as a source of external \
authentication. \
 \
For more features (OAuth/OpenID support, reverse proxy, ...) you can install \
other components (KeyCloak, Authelia, ...) using this server as the source of \
truth for users, via LDAP. \
 \
By default, the data is stored in SQLite, but you can swap the backend with \
MySQL/MariaDB or PostgreSQL."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "lldap-0.6.2-1.7.aarch64.rpm"
RPM_HASH = "1854bd9cb5b6f180a7a0d871d3ceb64af8ef8957f3b9250217ee48842e4e511be94a53d59fe88ab61ae46813c5deded44b50542c038528f7c3b9ad1ecfee9cf3"

RPROVIDES:${PN} += "bundled-rust-crate-actix \
bundled-rust-crate-actix-codec \
bundled-rust-crate-actix-derive \
bundled-rust-crate-actix-files \
bundled-rust-crate-actix-http \
bundled-rust-crate-actix-macros \
bundled-rust-crate-actix-router \
bundled-rust-crate-actix-rt \
bundled-rust-crate-actix-server \
bundled-rust-crate-actix-service \
bundled-rust-crate-actix-tls \
bundled-rust-crate-actix-utils \
bundled-rust-crate-actix-web \
bundled-rust-crate-actix-web-codegen \
bundled-rust-crate-actix-web-httpauth \
bundled-rust-crate-adler2 \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-aliasable \
bundled-rust-crate-alloc-no-stdlib \
bundled-rust-crate-alloc-stdlib \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-ascii \
bundled-rust-crate-async-stream \
bundled-rust-crate-async-stream-impl \
bundled-rust-crate-async-trait \
bundled-rust-crate-atoi \
bundled-rust-crate-atomic \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-base64ct \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake2b-simd \
bundled-rust-crate-block-buffer \
bundled-rust-crate-brotli \
bundled-rust-crate-brotli-decompressor \
bundled-rust-crate-bson \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-bytestring \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-combine \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-const-oid \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-convert-case \
bundled-rust-crate-cookie \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc \
bundled-rust-crate-crc-catalog \
bundled-rust-crate-crc32fast \
bundled-rust-crate-cron \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-crypto-mac \
bundled-rust-crate-ct-codecs \
bundled-rust-crate-curve25519-dalek \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-der \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-builder \
bundled-rust-crate-derive-builder-core \
bundled-rust-crate-derive-builder-macro \
bundled-rust-crate-derive-more \
bundled-rust-crate-derive-more-impl \
bundled-rust-crate-derive-utils \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dotenvy \
bundled-rust-crate-either \
bundled-rust-crate-email-address \
bundled-rust-crate-email-encoding \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-event-listener \
bundled-rust-crate-fastrand \
bundled-rust-crate-fiat-crypto \
bundled-rust-crate-figment \
bundled-rust-crate-figment-file-provider-adapter \
bundled-rust-crate-flate2 \
bundled-rust-crate-flume \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-enum \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-intrusive \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-generic-bytes \
bundled-rust-crate-getrandom \
bundled-rust-crate-graphql-parser \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hashlink \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hkdf \
bundled-rust-crate-hmac \
bundled-rust-crate-home \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-http-range \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-rustls \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-idna \
bundled-rust-crate-image \
bundled-rust-crate-impl-more \
bundled-rust-crate-indexmap \
bundled-rust-crate-inherent \
bundled-rust-crate-inlinable-string \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-juniper \
bundled-rust-crate-juniper-codegen \
bundled-rust-crate-jwt \
bundled-rust-crate-language-tags \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lber \
bundled-rust-crate-ldap3-proto \
bundled-rust-crate-lettre \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-libsqlite3-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lldap \
bundled-rust-crate-lldap-access-control \
bundled-rust-crate-lldap-auth \
bundled-rust-crate-lldap-domain \
bundled-rust-crate-lldap-domain-handlers \
bundled-rust-crate-lldap-domain-model \
bundled-rust-crate-lldap-frontend-options \
bundled-rust-crate-lldap-graphql-server \
bundled-rust-crate-lldap-ldap \
bundled-rust-crate-lldap-opaque-handler \
bundled-rust-crate-lldap-sql-backend-handler \
bundled-rust-crate-lldap-validation \
bundled-rust-crate-local-channel \
bundled-rust-crate-local-waker \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-md-5 \
bundled-rust-crate-memchr \
bundled-rust-crate-mime \
bundled-rust-crate-mime-guess \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-mutually-exclusive-features \
bundled-rust-crate-nom \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-bigint-dig \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-opaque-ke \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-ordered-float \
bundled-rust-crate-orion \
bundled-rust-crate-ouroboros \
bundled-rust-crate-ouroboros-macro \
bundled-rust-crate-overload \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-pear \
bundled-rust-crate-pear-codegen \
bundled-rust-crate-peg \
bundled-rust-crate-peg-macros \
bundled-rust-crate-peg-runtime \
bundled-rust-crate-pem-rfc7468 \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkcs1 \
bundled-rust-crate-pkcs8 \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro-error-attr2 \
bundled-rust-crate-proc-macro-error2 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-proc-macro2-diagnostics \
bundled-rust-crate-quote \
bundled-rust-crate-quoted-printable \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-lite \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-reqwest \
bundled-rust-crate-ring \
bundled-rust-crate-rsa \
bundled-rust-crate-rust-argon2 \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sct \
bundled-rust-crate-sea-bae \
bundled-rust-crate-sea-orm \
bundled-rust-crate-sea-orm-macros \
bundled-rust-crate-sea-query \
bundled-rust-crate-sea-query-binder \
bundled-rust-crate-secstr \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-bytes \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-sha1 \
bundled-rust-crate-sha2 \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-signature \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-smartstring \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-spki \
bundled-rust-crate-sqlx \
bundled-rust-crate-sqlx-core \
bundled-rust-crate-sqlx-macros \
bundled-rust-crate-sqlx-macros-core \
bundled-rust-crate-sqlx-mysql \
bundled-rust-crate-sqlx-postgres \
bundled-rust-crate-sqlx-sqlite \
bundled-rust-crate-static-assertions \
bundled-rust-crate-stringprep \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-sync-wrapper \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-actix-web \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-forest \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-try-lock \
bundled-rust-crate-typenum \
bundled-rust-crate-uncased \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-properties \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-unreachable \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-urlencoding \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-v-htmlescape \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-void \
bundled-rust-crate-want \
bundled-rust-crate-webpki \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-whoami \
bundled-rust-crate-winnow \
bundled-rust-crate-yansi \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
bundled-rust-crate-zeroize \
bundled-rust-crate-zeroize-derive \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
config-lldap \
group-lldap \
lldap \
user-lldap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
