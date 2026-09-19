SUMMARY = "Process coredump emitter using performance triggers"
DESCRIPTION = "A Linux version of the eponymous ProcDump tool from the Windows Sysinternals \
suite. It can create core dumps of processes based on performance triggers."
LICENSE = "BSD-2-Clause & MIT & BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "procdump-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "70fc1d68593951dab3c5b0395846cc389e84dbadc0c6d3971c380f2db3e6111ee3c1ff8ec289c9845bbcfe88f2b3e7e7787c116b23def15c6ee8923cf1ae1d46"

RPROVIDES:${PN} += "bundled-rust-crate-adler2 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-blazesym \
bundled-rust-crate-camino \
bundled-rust-crate-cargo-metadata \
bundled-rust-crate-cargo-platform \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-cpp-demangle \
bundled-rust-crate-equivalent \
bundled-rust-crate-errno \
bundled-rust-crate-fallible-iterator \
bundled-rust-crate-fastrand \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libbpf-cargo \
bundled-rust-crate-libbpf-rs \
bundled-rust-crate-libbpf-sys \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procdump \
bundled-rust-crate-procdump-cli \
bundled-rust-crate-quote \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vsprintf \
bundled-rust-crate-zmij \
procdump"

RDEPENDS:${PN} += "gdb \
libc.so.6 \
libelf.so.1 \
libgcc-s.so.1 \
libz.so.1"

inherit rpm
