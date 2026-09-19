SUMMARY = "A cross-platform lightweight virtual machine and language"
DESCRIPTION = "Neko VM is a virtual machine for the Neko language. Neko is a \
high-level dynamically typed programming language. It can be used as \
an embedded scripting language."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "neko-2.4.1-3.3.aarch64.rpm"
RPM_HASH = "368a4a65d25c36d5791834df659d28b2bb5ba47a78b936417b54abc32258d6aa47dde48d8cf45b6e721f48683c26944107dc5cc987411700b27e81de27da59ff"

RPROVIDES:${PN} += "neko \
nekovm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libneko.so.2 \
libneko2 \
libpcre2-8.so.0 \
libsqlite3.so.0 \
libz.so.1"

inherit rpm
