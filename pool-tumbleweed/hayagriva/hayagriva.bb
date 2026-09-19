SUMMARY = "Standalone CLI of built-in bibliography management tool"
DESCRIPTION = "Standalone CLI of the built-in bibliography management library used in typst."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "hayagriva-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "5f526f90f889f45962945124bb361e50e777e94171a31b98505b665bf1e4230fad0132b128bb00ede51a2a5145b213d8b00682e388147cf7f2b04eeb8e673085"

RPROVIDES:${PN} += "bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-biblatex \
bundled-rust-crate-cfg-if \
bundled-rust-crate-ciborium \
bundled-rust-crate-ciborium-io \
bundled-rust-crate-ciborium-ll \
bundled-rust-crate-citationberg \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-displaydoc \
bundled-rust-crate-equivalent \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hayagriva \
bundled-rust-crate-heck \
bundled-rust-crate-icu-collator \
bundled-rust-crate-icu-collator-data \
bundled-rust-crate-icu-collections \
bundled-rust-crate-icu-locale \
bundled-rust-crate-icu-locale-core \
bundled-rust-crate-icu-locale-data \
bundled-rust-crate-icu-normalizer \
bundled-rust-crate-icu-normalizer-data \
bundled-rust-crate-icu-properties \
bundled-rust-crate-icu-properties-data \
bundled-rust-crate-icu-provider \
bundled-rust-crate-idna \
bundled-rust-crate-idna-adapter \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal-polyfill \
bundled-rust-crate-itoa \
bundled-rust-crate-litemap \
bundled-rust-crate-memchr \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-potential-utf \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-roman-numerals-rs \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-core \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-path-to-error \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-smallvec \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinystr \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unic-langid \
bundled-rust-crate-unic-langid-impl \
bundled-rust-crate-unic-langid-macros \
bundled-rust-crate-unic-langid-macros-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-unscanny \
bundled-rust-crate-url \
bundled-rust-crate-utf16-iter \
bundled-rust-crate-utf8-iter \
bundled-rust-crate-utf8parse \
bundled-rust-crate-write16 \
bundled-rust-crate-writeable \
bundled-rust-crate-yoke \
bundled-rust-crate-yoke-derive \
bundled-rust-crate-zerofrom \
bundled-rust-crate-zerofrom-derive \
bundled-rust-crate-zerotrie \
bundled-rust-crate-zerovec \
bundled-rust-crate-zerovec-derive \
hayagriva"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
