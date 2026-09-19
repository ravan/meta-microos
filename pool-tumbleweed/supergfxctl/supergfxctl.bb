SUMMARY = "Super graphics mode controller"
DESCRIPTION = "supergfxctl is a super graphics mode controller for laptops with hybrid nvidia."
LICENSE = "MPL-2.0"

PV = "1762634235.5d503b1"

RPM_NAME = "supergfxctl-1762634235.5d503b1-2.2.aarch64.rpm"
RPM_HASH = "25c8fd7ed5230cf9746ee497423ed931dfaab4f2e6a00c07c7109a89e0d369cbc8d107f217e756a906ebc089407e22185cb97da857e51d715f11d8c1b90506bf"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-async-broadcast \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-process \
bundled-rust-crate-async-recursion \
bundled-rust-crate-async-signal \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-blocking \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-colorchoice \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-defmt \
bundled-rust-crate-defmt-macros \
bundled-rust-crate-defmt-parser \
bundled-rust-crate-endi \
bundled-rust-crate-enumflags2 \
bundled-rust-crate-enumflags2-derive \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-event-listener \
bundled-rust-crate-event-listener-strategy \
bundled-rust-crate-fastrand \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-gumdrop \
bundled-rust-crate-gumdrop-derive \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hex \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-jiff-core \
bundled-rust-crate-libc \
bundled-rust-crate-libudev-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-logind-zbus \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-stream \
bundled-rust-crate-parking \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-piper \
bundled-rust-crate-pkg-config \
bundled-rust-crate-polling \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-socket2 \
bundled-rust-crate-supergfxctl \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-udev \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-winnow \
bundled-rust-crate-zbus \
bundled-rust-crate-zbus-macros \
bundled-rust-crate-zbus-names \
bundled-rust-crate-zmij \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
config-supergfxctl \
group-supergfxctl \
supergfxctl \
user-supergfxctl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libudev.so.1 \
systemd \
sysuser-shadow"

inherit rpm
