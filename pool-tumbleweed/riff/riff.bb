SUMMARY = "A diff filter highlighting which line parts have changed"
DESCRIPTION = "Riff is a wrapper around diff that highlights which parts of lines have changed."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "riff-3.6.2-1.2.aarch64.rpm"
RPM_HASH = "90bc4e09d4ff5f965a5862deb3e1cb902efa8b58ff6d9cba4994f3e830ae6229abee84600f4ab587ab643563f6767be5cd3b600af68194012d08f379ce8f4d01"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler2 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-backtrace \
bundled-rust-crate-bytecount \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-displaydoc \
bundled-rust-crate-either \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-gimli \
bundled-rust-crate-git-version \
bundled-rust-crate-git-version-macro \
bundled-rust-crate-heck \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-litemap \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-num-cpus \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-riffdiff \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustversion \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-similar \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-threadpool \
bundled-rust-crate-tinystr \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-url \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
riff"

RDEPENDS:${PN} += "diff \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
