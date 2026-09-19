SUMMARY = "Fast all-in-one JavaScript runtime and toolkit"
DESCRIPTION = "Bun is an all-in-one JavaScript runtime and toolkit with a bundler, test \
runner, and Node.js-compatible package manager."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & LGPL-2.1-or-later & MIT & MPL-2.0 & Unicode-3.0 & Zlib & blessing"

PV = "1.4.2"

RPM_NAME = "bun-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "6f9b8534fa0ce3cb80b111912d6dc4350ded4b8e57a1b21c66d9bd7feb0aede700859516f8a9633415cd8cf2aadaeb5e1587ab45abd0a7dd4ae04e70327277b7"

RPROVIDES:${PN} += "bun \
bundled-bcrypt \
bundled-boringssl \
bundled-c-ares \
bundled-hdr-histogram \
bundled-highway \
bundled-libarchive \
bundled-lol-html \
bundled-ls-hpack \
bundled-ls-qpack \
bundled-lsquic \
bundled-mimalloc \
bundled-picohttpparser \
bundled-rust-argon2 \
bundled-sqlite3 \
bundled-tinycc \
bundled-usockets \
bundled-uwebsockets \
bundled-webkit \
bundled-zlib-ng"

RDEPENDS:${PN} += "libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libdeflate.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libspng.so.0 \
libturbojpeg.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libzstd.so.1"

inherit rpm
