SUMMARY = "Rootless Xwayland integration for Wayland compositors"
DESCRIPTION = "xwayland-satellite grants rootless Xwayland integration to any Wayland \
compositor implementing xdg_wm_base. This useful for compositors that \
do not support rootless Xwayland themselves (such as niri & weston 14)."
LICENSE = "MPL-2.0"

PV = "0.8.2"

RPM_NAME = "xwayland-satellite-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "b3111a9680c3b112b967c5194dee352b88353b32227eaff3dfecd4a334a2e05c6e9591ffb41a9cfd8414eb39379c606b0b7327b6b90baf2ec8a54e2d2e9c23f3"

RPROVIDES:${PN} += "bundled-rust-crate-ab-glyph \
bundled-rust-crate-ab-glyph-rasterizer \
bundled-rust-crate-adler2 \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-allocator-api2 \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-bindgen \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-cc \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-crc32fast \
bundled-rust-crate-cursor-icon \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-builder \
bundled-rust-crate-derive-builder-core \
bundled-rust-crate-derive-builder-macro \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-either \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fdeflate \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foldhash \
bundled-rust-crate-fontdue \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hecs \
bundled-rust-crate-hecs-macros \
bundled-rust-crate-humantime \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-macros \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nom \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-enum \
bundled-rust-crate-num-enum-derive \
bundled-rust-crate-num-threads \
bundled-rust-crate-once-cell \
bundled-rust-crate-owned-ttf-parser \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-powerfmt \
bundled-rust-crate-pretty-env-logger \
bundled-rust-crate-prettyplease \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-sd-notify \
bundled-rust-crate-serde-core \
bundled-rust-crate-shlex \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-smithay-client-toolkit \
bundled-rust-crate-spin \
bundled-rust-crate-strict-num \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tiny-skia \
bundled-rust-crate-tiny-skia-path \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-toml-parser \
bundled-rust-crate-ttf-parser \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-vergen \
bundled-rust-crate-vergen-gitcl \
bundled-rust-crate-vergen-lib \
bundled-rust-crate-version-check \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-csd-frame \
bundled-rust-crate-wayland-cursor \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-protocols-experimental \
bundled-rust-crate-wayland-protocols-misc \
bundled-rust-crate-wayland-protocols-wlr \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-server \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-winnow \
bundled-rust-crate-wl-drm \
bundled-rust-crate-xcb \
bundled-rust-crate-xcb-util-cursor \
bundled-rust-crate-xcb-util-cursor-sys \
bundled-rust-crate-xcursor \
bundled-rust-crate-xkeysym \
bundled-rust-crate-xwayland-satellite \
bundled-rust-crate-zerocopy \
xwayland-satellite"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxcb-cursor.so.0 \
libxcb.so.1 \
xwayland"

inherit rpm
