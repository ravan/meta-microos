SUMMARY = "An AV1 video encoding wrapper"
DESCRIPTION = "AV1 video encoding tool with VMAF sampling & automatic encoder CRF \
calculation. It uses ffmpeg and SVT-AV1."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "ab-av1-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "0ebf3f70ef5ab656062b182f428fa529a901bf11a7d90f9f91a775ea049ee0d99ee18c765e6cd1d54de1d421b33eeb81daa7da0f138477f68d774c36c382f96e"

RPROVIDES:${PN} += "ab-av1 \
bundled-rust-crate-ab-av1 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-async-stream \
bundled-rust-crate-async-stream-impl \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-verbosity-flag \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-deranged \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-env-filter \
bundled-rust-crate-env-logger \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-ffprobe \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-fs2 \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-fxhash \
bundled-rust-crate-heck \
bundled-rust-crate-humantime \
bundled-rust-crate-indicatif \
bundled-rust-crate-infer \
bundled-rust-crate-instant \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-jiff \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-num-conv \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shell-escape \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-sled \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-process-stream \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-tokio-util \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unit-prefix \
bundled-rust-crate-utf8parse \
bundled-rust-crate-zmij"

RDEPENDS:${PN} += "ffmpeg \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
