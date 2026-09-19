SUMMARY = "Command-line task management tool for sequential and parallel execution"
DESCRIPTION = "Pueue is a command-line task management tool for sequential and parallel execution of long-running tasks. \
It's a tool that processes a queue of shell commands. \
Since Pueue is not bound to any terminal, you can control your tasks from any terminal on the same machine. \
The queue will be continuously processed, even if you no longer have any active ssh sessions."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "pueue-3.4.1-1.12.aarch64.rpm"
RPM_HASH = "54f5d2459196a6419b74a23150800279e8663b0e242a5b57c3a11000fb5edac9bd13a1c871b6dc67aee52244eaaf6de624d89a8142846e774c40ee6244139190"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-beef \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-complete-nushell \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-comfy-table \
bundled-rust-crate-command-group \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossterm \
bundled-rust-crate-crypto-common \
bundled-rust-crate-ctrlc \
bundled-rust-crate-deranged \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-fnv \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-half \
bundled-rust-crate-handlebars \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-interim \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lazycell \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libproc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-logos \
bundled-rust-crate-logos-codegen \
bundled-rust-crate-logos-derive \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pem \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-powerfmt \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procfs \
bundled-rust-crate-procfs-core \
bundled-rust-crate-pueue \
bundled-rust-crate-pueue-lib \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rcgen \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rev-buf-reader \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-rustls-pki-types \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-cbor \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha2 \
bundled-rust-crate-shell-escape \
bundled-rust-crate-shellexpand \
bundled-rust-crate-shlex \
bundled-rust-crate-simplelog \
bundled-rust-crate-smallvec \
bundled-rust-crate-snap \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-untrusted \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-whoami \
bundled-rust-crate-yasna \
bundled-rust-crate-zeroize \
pueue"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
