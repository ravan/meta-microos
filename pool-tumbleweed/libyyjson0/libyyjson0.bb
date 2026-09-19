SUMMARY = "A JSON library in C"
DESCRIPTION = "A JSON library compliant with the RFC 8259 JSON standard. It enforces \
strict number formats and UTF-8 validation. It offers options to \
enable individual JSON5 features and custom allocators. It supports \
querying and modifying with JSON Pointer (RFC 6901), JSON Patch \
(6902), and JSON Merge Patch (7386). It also supports \\u0000 \
characters and non-NUL-terminated strings. \
 \
An array or object is not stored using random-access memory, which \
makes accessing elements by index or key slower than using an \
iterator."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "libyyjson0-0.12.0-1.5.aarch64.rpm"
RPM_HASH = "85867f858abd8ca8c275cf7fa541e11391f40d501d264a2c2e16e1cf30b90acf69391b828ed38a3a5594131c163bfe955d11e5098736e19820c7e00f22f9ce08"

RPROVIDES:${PN} += "libyyjson.so.0 \
libyyjson0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
