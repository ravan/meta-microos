SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "24.18.1"

RPM_NAME = "nodejs24-24.18.1-1.1.aarch64.rpm"
RPM_HASH = "839c8ba15362d344ab017001e8edded7f8db70c9a59f2c1c9b71e7aa67bdd925af0689712536bac11e09ddfa70c5364ee87789a54c946102f0e040bb582ee638"

RPROVIDES:${PN} += "bundled-LIEF \
bundled-ada \
bundled-libuv \
bundled-llhttp \
bundled-merve \
bundled-nghttp2 \
bundled-ngtcp2 \
bundled-node-acorn \
bundled-node-acorn-walk \
bundled-node-amaro \
bundled-node-corepack \
bundled-node-minimatch \
bundled-node-undici \
bundled-simdjson \
bundled-uvwasi \
bundled-v8 \
nodejs \
nodejs-abi \
nodejs-engine \
nodejs24"

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
