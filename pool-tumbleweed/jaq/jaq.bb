SUMMARY = "jq clone in Rust"
DESCRIPTION = "jaq (pronounced like Jacques) is a clone of the JSON data processing tool \
jq. jaq aims to support a large subset of jq's syntax and operations."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "jaq-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "4477ce0e162a79ae7c91985aa4b7c3c476ae89a23f90c3c31dfbbd72ecd977b8453b2a23b74ddd8c5b1f98c33190c7df65abdc75b28b912c59b9a57799aca5f8"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-codesnake \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dyn-clone \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fastrand \
bundled-rust-crate-fd-lock \
bundled-rust-crate-foldhash \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hifijson \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jaq \
bundled-rust-crate-jaq-core \
bundled-rust-crate-jaq-json \
bundled-rust-crate-jaq-std \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-libmimalloc-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-mimalloc \
bundled-rust-crate-nix \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-regex-lite \
bundled-rust-crate-rustix \
bundled-rust-crate-rustyline \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-json \
bundled-rust-crate-shlex \
bundled-rust-crate-tempfile \
bundled-rust-crate-typed-arena \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-urlencoding \
bundled-rust-crate-utf8parse \
bundled-rust-crate-yansi \
jaq"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
