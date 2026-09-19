SUMMARY = "A C implementation of Varlink, a protocol for creating APIs"
DESCRIPTION = "Varlink is an interface description format and protocol for creating APIs. \
 \
A varlink interface combines the classic UNIX command line options, \
STDIN/OUT/ERROR text formats, man pages, service metadata and provides the \
equivalent over a single file descriptor, a.k.a. “FD3”. \
 \
Varlink is plain-text, type-safe, discoverable, self-documenting and remotable."
LICENSE = "MIT"

PV = "24"

RPM_NAME = "libvarlink0-24-1.7.aarch64.rpm"
RPM_HASH = "cc4a73eff967a7305633e8631fea44f81ca81e3603358358f122cd4e6e5d57c1780d0dcfa6db065d7f311c06bcbae68f98ebabed23b8613d9d94feae141f622b"

RPROVIDES:${PN} += "libvarlink \
libvarlink.so.0 \
libvarlink0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
