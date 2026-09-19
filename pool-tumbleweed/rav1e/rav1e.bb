SUMMARY = "Fastest and safest AV1 encoder"
DESCRIPTION = "rav1e is an AV1 video encoder. \
 \
AV1 is a video codec by the Alliance for Open Media, composed of most \
of the important Web companies (Google, Facebook, Netflix, Amazon, \
Microsoft, Mozilla...). \
 \
AV1 has the potential to be up to 20% better than the HEVC codec, but \
the patents license is totally free, while HEVC patents licenses are \
insanely high and very confusing. \
 \
rav1e features: \
 \
* Intra and inter frames \
* 64x64 superblocks \
* 4x4 to 64x64 RDO-selected square and 2:1/1:2 rectangular blocks \
* DC, H, V, Paeth, smooth, and a subset of directional prediction modes \
* DCT, (FLIP-)ADST and identity transforms (up to 64x64, 16x16 and 32x32 respectively) \
* 8-, 10- and 12-bit depth color \
* 4:2:0 (full support), 4:2:2 and 4:4:4 (limited) chroma sampling \
* Variable speed settings \
* Near real-time encoding at high speed levels"
LICENSE = "BSD-2-Clause & ISC"

PV = "0.8.1"

RPM_NAME = "rav1e-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "95f93a9ea0855ebca01ed8a06c1323b5f4f1a50866b0e83862ef3f3baf0b1de2f8ff75986086ac3f401ef8c2a5f8df43f4a84c08a0a24b1ea708b303e762e33a"

RPROVIDES:${PN} += "bundled-rust-crate-aligned \
bundled-rust-crate-aligned-vec \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-arg-enum-proc-macro \
bundled-rust-crate-arrayvec \
bundled-rust-crate-as-slice \
bundled-rust-crate-autocfg \
bundled-rust-crate-av-metrics \
bundled-rust-crate-av-scenechange \
bundled-rust-crate-av1-grain \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitstream-io \
bundled-rust-crate-built \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-equator \
bundled-rust-crate-equator-macro \
bundled-rust-crate-errno \
bundled-rust-crate-fern \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-interpolate-name \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-ivf \
bundled-rust-crate-jobserver \
bundled-rust-crate-lab \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-maybe-rayon \
bundled-rust-crate-memchr \
bundled-rust-crate-nasm-rs \
bundled-rust-crate-new-debug-unreachable \
bundled-rust-crate-no-std-io2 \
bundled-rust-crate-nom \
bundled-rust-crate-noop-proc-macro \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-paste \
bundled-rust-crate-pastey \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-profiling \
bundled-rust-crate-profiling-procmacros \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rav1e \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rustix \
bundled-rust-crate-scan-fmt \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-helpers \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-v-frame \
bundled-rust-crate-y4m \
bundled-rust-crate-zerocopy \
bundled-rust-crate-zerocopy-derive \
rav1e"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
