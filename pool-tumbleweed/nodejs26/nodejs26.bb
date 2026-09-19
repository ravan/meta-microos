SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "26.7.0"

RPM_NAME = "nodejs26-26.7.0-1.1.aarch64.rpm"
RPM_HASH = "a3e018a15e412b8a9f21a7b0cb798c89351f001eb8147003ed357b2b808c1a4c5ffd5c5fa73d0e811e7739e3c2953a25fc49bb5558d4f09201b0d6b0615b69d8"

RPROVIDES:${PN} += "bundled-LIEF \
bundled-ada \
bundled-libuv \
bundled-llhttp \
bundled-merve \
bundled-nghttp2 \
bundled-nghttp3 \
bundled-ngtcp2 \
bundled-node-acorn \
bundled-node-acorn-walk \
bundled-node-amaro \
bundled-node-minimatch \
bundled-node-undici \
bundled-simdjson \
bundled-uvwasi \
bundled-v8 \
libnode.so.147 \
nodejs \
nodejs-abi \
nodejs-engine \
nodejs26"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
nodejs-common"

inherit rpm
