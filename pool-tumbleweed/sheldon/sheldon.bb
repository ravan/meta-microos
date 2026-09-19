SUMMARY = "Fast, configurable, shell plugin manager"
DESCRIPTION = "Sheldon is a fast, configurable, command-line tool to manage your shell plugins. \
 \
How does it work? \
 \
Plugins are specified in a TOML configuration file and Sheldon renders an install script using user configurable templates. \
 \
A ~/.zshrc or ~/.bashrc that uses Sheldon simply contains the following. \
 \
eval '$(sheldon source)' \
Sheldon can manage GitHub or Git repositories, Gists, arbitrary remote scripts or binaries, local plugins, and inline plugins. \
Plugins are installed and updated in parallel and as a result Sheldon is blazingly fast."
LICENSE = "MIT | Apache-2.0 & MIT & Zlib & LGPL-2.1-or-later & CC-BY-SA-4.0 & Apache-2.0-with-LLVM-exception & BSD-4-clause & OpenSSL & Unicode & SUSE-GPL-2.0-with-linking-exception"

PV = "0.8.5"

RPM_NAME = "sheldon-0.8.5-1.8.aarch64.rpm"
RPM_HASH = "c0dfdf67652eacd3d71ed7211acbd6071851ddf9655b8cf31dd4f002a5f034016742244fb3b3d0718dddaf494138b09d71b5cb6fc4a8c6b537758d4cd02d1941"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-casual \
bundled-rust-crate-cc \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-constcat \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-curl \
bundled-rust-crate-curl-sys \
bundled-rust-crate-displaydoc \
bundled-rust-crate-either \
bundled-rust-crate-env-home \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fmutex \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-git2 \
bundled-rust-crate-globset \
bundled-rust-crate-globwalk \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-itertools \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libssh2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-maplit \
bundled-rust-crate-memchr \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-macro \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sheldon \
bundled-rust-crate-shlex \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinystr \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-toml-writer \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-upon \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-vcpkg \
bundled-rust-crate-walkdir \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-writeable \
bundled-rust-crate-yansi \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
sheldon"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
