SUMMARY = "Boot large ruby/rails apps faster"
DESCRIPTION = "Boot large ruby/rails apps faster."
LICENSE = "MIT"

PV = "1.18.4"

RPM_NAME = "ruby4.0-rubygem-bootsnap-1.18.4-1.12.aarch64.rpm"
RPM_HASH = "69c7dd1ed4b39b9c4bb0a200cabba3ecaae1ffb10abaa60c5a3efec69eb86952dda8e7a48e26806d4a5c725c2203946b1c44767edafac7e11de4c18e065fc8b5"

RPROVIDES:${PN} += "ruby4.0-rubygem-bootsnap \
rubygem-bootsnap \
rubygem-ruby-4.0.0-bootsnap \
rubygem-ruby-4.0.0-bootsnap-1 \
rubygem-ruby-4.0.0-bootsnap-1.18 \
rubygem-ruby-4.0.0-bootsnap-1.18.4"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-msgpack-1"

inherit rpm
