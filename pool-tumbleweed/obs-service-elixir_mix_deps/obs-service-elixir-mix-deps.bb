SUMMARY = "OBS Source Service for Elixir software packaging"
DESCRIPTION = "OBS Source Service for Elixir software packaging"
LICENSE = "GPL-2.0-only"

PV = "0.3.1~0"

RPM_NAME = "obs-service-elixir_mix_deps-0.3.1~0-1.8.aarch64.rpm"
RPM_HASH = "4bd63e65ea8dae8f7a31ca850276566dc1242452f2905891c6b16a897ff599adf6bfa3408ef058b96bf7cd002f94a16d256c1b8d885d79f49f938650edfef233"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-errno \
bundled-rust-crate-filetime \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-flate2 \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-obs-service-elixir-mix-deps \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-xattr \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
obs-service-elixir-mix-deps"

RDEPENDS:${PN} += "elixir \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
