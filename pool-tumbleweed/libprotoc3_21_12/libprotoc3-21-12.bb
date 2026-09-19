SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotoc3_21_12-21.12-4.9.aarch64.rpm"
RPM_HASH = "86224094b312595db34d20eeabf60e47abd603ed9294ff81ebc6e77895e667d231a2ca6584988bc7af7941b206600990a4a48d392ec8c340552eb36d74a0a6fc"

RPROVIDES:${PN} += "libprotoc.so.3.21.12.0 \
libprotoc3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.3.21.12.0 \
libstdc++.so.6"

inherit rpm
