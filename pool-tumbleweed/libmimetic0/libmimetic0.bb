SUMMARY = "A C++ MIME library"
DESCRIPTION = "It has been built around the standard library; there are no custom \
string classes or list implementations. Class functionalities and \
behavior is modeled around MIME and the Internet message RFCs. See \
RFC 5322, 2045 and 2046 for terminology, etc. \
2046."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "libmimetic0-0.9.8-4.7.aarch64.rpm"
RPM_HASH = "c00478028168b64b81fb3ca72f05adfa17518396326282e399196271bfffba698bf6c6e268fef2a9b835ab9817a8b2b1c3bc908f0abf252c76156f65c4f4174a"

RPROVIDES:${PN} += "libmimetic.so.0 \
libmimetic0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
