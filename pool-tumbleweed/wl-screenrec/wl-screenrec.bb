SUMMARY = "High performance hardware accelerated wlroots screen recorder"
DESCRIPTION = "High performance screen recorder for wlroots Wayland. \
 \
Uses dma-buf transfers to get surface, and uses the GPU to do both the pixel \
format conversion and the encoding, meaning the raw video data never touches the \
CPU, leaving it free to run your applications."
LICENSE = "Apache-2.0"

PV = "0.2.0+git.20260517T151356.0925290"

RPM_NAME = "wl-screenrec-0.2.0+git.20260517T151356.0925290-1.1.aarch64.rpm"
RPM_HASH = "27adcf08fece25b30a21509498efedb90b098dc6beabab24c4cae6dc32f6a87f32673d1236f6954ac6abe8096e3caa77713e659ae7c526ebbca61a2122c33268"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-ash \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytemuck-derive \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-deranged \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-drm \
bundled-rust-crate-drm-ffi \
bundled-rust-crate-drm-fourcc \
bundled-rust-crate-drm-sys \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-ffmpeg-next \
bundled-rust-crate-ffmpeg-sys-next \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-glob \
bundled-rust-crate-heck \
bundled-rust-crate-human-size \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-log-once \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-mio \
bundled-rust-crate-nom \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-pkg-config \
bundled-rust-crate-powerfmt \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-serde-core \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simplelog \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-protocols-wlr \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wl-screenrec \
wl-screenrec"

RDEPENDS:${PN} += "libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1"

inherit rpm
