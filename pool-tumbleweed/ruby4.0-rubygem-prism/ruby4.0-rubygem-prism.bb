SUMMARY = "Prism Ruby parser"
DESCRIPTION = "Prism Ruby parser."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-prism-1.4.0-1.8.aarch64.rpm"
RPM_HASH = "d11a736b7bdbbab4af5b8d0497920e016ce5a6f0155eddacee9e692a2b531203020863c138b13105d20945f9036176fa1bd2e4a77f89848db8ba1f77635f875b"

RPROVIDES:${PN} += "ruby4.0-rubygem-prism \
rubygem-prism \
rubygem-ruby-4.0.0-prism \
rubygem-ruby-4.0.0-prism-1 \
rubygem-ruby-4.0.0-prism-1.4 \
rubygem-ruby-4.0.0-prism-1.4.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
