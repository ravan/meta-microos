SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoCrypto123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "3abbfa4b057eed2bc6a829a9d346780a9824183b00c1c89060472a0e3d5399423bf133485827536309f8568735f9b227149fa830c1d83b1b0c02a4691648e126"

RPROVIDES:${PN} += "libPocoCrypto.so.123 \
libPocoCrypto123 \
poco-crypto"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
