SUMMARY = "An alternative to the 'find' utility"
DESCRIPTION = "fd is an alternative to GNU find. It features: \
 \
* Colorized terminal output (similar to ls). \
* The search is case-insensitive by default. It switches to \
  case-sensitive if the pattern contains an uppercase character. \
* By default, ignores patterns from .gitignore, and ignores hidden \
  directories and files. \
* Supports regular expressions and Unicode awareness. \
* A parallel execution similar to GNU Parallel is available."
LICENSE = "Apache-2.0 & MIT"

PV = "10.4.2"

RPM_NAME = "fd-10.4.2-1.5.aarch64.rpm"
RPM_HASH = "05966817b6fa16c1c53a8e246bfac9f068485e8d1726f5b3b9dcd346e9430ed7dceb74837dfa57aa932eae35a0836fe8484b504035705b3a9283d51cc3b7ba56"

RPROVIDES:${PN} += "bundled-crate(aho-corasick) \
bundled-crate(ansi-term) \
bundled-crate(anyhow) \
bundled-crate(atty) \
bundled-crate(autocfg) \
bundled-crate(bitflags) \
bundled-crate(bstr) \
bundled-crate(cc) \
bundled-crate(cfg-if) \
bundled-crate(chrono) \
bundled-crate(clap) \
bundled-crate(crossbeam-utils) \
bundled-crate(ctrlc) \
bundled-crate(diff) \
bundled-crate(dirs-next) \
bundled-crate(dirs-sys-next) \
bundled-crate(fd-find) \
bundled-crate(filetime) \
bundled-crate(fnv) \
bundled-crate(fs-extra) \
bundled-crate(fuchsia-cprng) \
bundled-crate(getrandom) \
bundled-crate(globset) \
bundled-crate(hermit-abi) \
bundled-crate(humantime) \
bundled-crate(ignore) \
bundled-crate(jemalloc-sys) \
bundled-crate(jemallocator) \
bundled-crate(lazy-static) \
bundled-crate(libc) \
bundled-crate(log) \
bundled-crate(lscolors) \
bundled-crate(memchr) \
bundled-crate(memoffset) \
bundled-crate(nix) \
bundled-crate(normpath) \
bundled-crate(num-cpus) \
bundled-crate(num-integer) \
bundled-crate(num-traits) \
bundled-crate(once-cell) \
bundled-crate(proc-macro2) \
bundled-crate(quote) \
bundled-crate(rand) \
bundled-crate(rand-core) \
bundled-crate(rdrand) \
bundled-crate(redox-syscall) \
bundled-crate(redox-users) \
bundled-crate(regex) \
bundled-crate(regex-syntax) \
bundled-crate(remove-dir-all) \
bundled-crate(same-file) \
bundled-crate(strsim) \
bundled-crate(syn) \
bundled-crate(tempdir) \
bundled-crate(term-size) \
bundled-crate(test-case) \
bundled-crate(textwrap) \
bundled-crate(thread-local) \
bundled-crate(time) \
bundled-crate(unicode-width) \
bundled-crate(unicode-xid) \
bundled-crate(users) \
bundled-crate(vec-map) \
bundled-crate(version-check) \
bundled-crate(walkdir) \
bundled-crate(wasi) \
bundled-crate(winapi) \
bundled-crate(winapi-i686-pc-windows-gnu) \
bundled-crate(winapi-util) \
bundled-crate(winapi-x86-64-pc-windows-gnu) \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-argmax \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-aliases \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-ctrlc \
bundled-rust-crate-errno \
bundled-rust-crate-etcetera \
bundled-rust-crate-faccess \
bundled-rust-crate-fd-find \
bundled-rust-crate-find-msvc-tools \
bundled-rust-crate-globset \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-jiff \
bundled-rust-crate-jiff-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-memchr \
bundled-rust-crate-nix \
bundled-rust-crate-normpath \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-once-cell \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-tikv-jemalloc-sys \
bundled-rust-crate-tikv-jemallocator \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
fd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
