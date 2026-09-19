SUMMARY = "Azure Entra Id Browser SSO"
DESCRIPTION = "Himmelblau SSO provides Azure Entra Id browser single sign-on via \
Firefox, Chromium, Google Chrome, and Microsoft Edge (where installed), \
using native messaging and managed browser policies. It also provides \
web apps for common Office 365 applications (Teams, Outlook, etc)."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.14+git0.7d1ea961"

RPM_NAME = "himmelblau-sso-3.1.14+git0.7d1ea961-1.1.aarch64.rpm"
RPM_HASH = "2ee7c83e03d99e8bf40f173a16643b847323bc5e02d847bf077c3de2986cd0532fc154803628207cd630199c8f88319d88721e73e62138170ebe7419c8846b0c"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
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
bundled-rust-crate-broker-client \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-endi \
bundled-rust-crate-enumflags2 \
bundled-rust-crate-enumflags2-derive \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-event-listener \
bundled-rust-crate-event-listener-strategy \
bundled-rust-crate-fastrand \
bundled-rust-crate-foldhash \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-stream \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-piper \
bundled-rust-crate-polling \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand-core \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-sha1-smol \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-sso \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-winnow \
bundled-rust-crate-zbus \
bundled-rust-crate-zbus-macros \
bundled-rust-crate-zbus-names \
bundled-rust-crate-zcheapstr \
bundled-rust-crate-zmij \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
config-himmelblau-sso \
himmelblau-sso"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
himmelblau \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
