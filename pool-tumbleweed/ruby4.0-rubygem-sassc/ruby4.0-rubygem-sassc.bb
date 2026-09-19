SUMMARY = "Use libsass with Ruby!"
DESCRIPTION = "Use libsass with Ruby!."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-sassc-2.4.0-2.30.aarch64.rpm"
RPM_HASH = "3a2e5b8016bfd20c58f9bbd38dbe8e473872f91f3ca725f5ab7e251fd9a30b16c4743b50169152b0bf8376b477866c3e3723518036f5b607f5b41078e1e6f053"

RPROVIDES:${PN} += "libsass.so \
ruby4.0-rubygem-sassc \
rubygem-ruby-4.0.0-sassc \
rubygem-ruby-4.0.0-sassc-2 \
rubygem-ruby-4.0.0-sassc-2.4 \
rubygem-ruby-4.0.0-sassc-2.4.0 \
rubygem-sassc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-ffi-1"

inherit rpm
