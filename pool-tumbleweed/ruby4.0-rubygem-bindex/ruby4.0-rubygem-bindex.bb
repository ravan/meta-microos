SUMMARY = "Bindings for your Ruby exceptions"
DESCRIPTION = "Bindings for your Ruby exceptions."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "ruby4.0-rubygem-bindex-0.8.1-1.38.aarch64.rpm"
RPM_HASH = "673f12034e95c5e757aab0309747b6f90e8931860e8409dce46033c68c2f96a0babcebd36e0149ad601398207d655dfab63e411a820b50492780d8456b4ad706"

RPROVIDES:${PN} += "ruby4.0-rubygem-bindex \
rubygem-bindex \
rubygem-ruby-4.0.0-bindex \
rubygem-ruby-4.0.0-bindex-0 \
rubygem-ruby-4.0.0-bindex-0.8 \
rubygem-ruby-4.0.0-bindex-0.8.1"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
