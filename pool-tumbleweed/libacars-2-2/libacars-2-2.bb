SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "libacars-2-2-2.2.1-1.4.aarch64.rpm"
RPM_HASH = "098cfd4d98f663e81a79a905d99a20e2ae65ccc2a8a682c5852e87b65679df4e547b3a45ae10673e6084dfd40e184e41fae6a306a757e10eb62b8f8062efbe07"

RPROVIDES:${PN} += "libacars-2-2 \
libacars-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libxml2.so.16 \
libz.so.1"

inherit rpm
