SUMMARY = "A networking Library"
DESCRIPTION = "A user-mode networking library used by virtual machines, containers \
or various tools."
LICENSE = "MIT"

PV = "4.9.3+4"

RPM_NAME = "libslirp0-4.9.3+4-1.3.aarch64.rpm"
RPM_HASH = "6b04ed56fb67acafecf25d095d6b7b69e1c783f6f4347ce301a505d2a6cb9e7feb064e1f448504d03618c74df785a589b43cbc9b5b99f9693145f33f7d503e35"

RPROVIDES:${PN} += "libslirp.so.0 \
libslirp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
