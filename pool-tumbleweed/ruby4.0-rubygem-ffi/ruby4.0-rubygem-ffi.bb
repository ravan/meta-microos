SUMMARY = "Ruby FFI"
DESCRIPTION = "Ruby FFI library."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "ruby4.0-rubygem-ffi-1.17.1-1.10.aarch64.rpm"
RPM_HASH = "dfabe05ca53358c58c22f2e84c8be4c4d9c5ba58a740c3d7b3e96909936e61009f338a2a9aed7bfceb7fb05450af3d770adf1a0f7820bf46c973b643a320f76c"

RPROVIDES:${PN} += "ruby4.0-rubygem-ffi \
rubygem-ffi \
rubygem-ruby-4.0.0-ffi \
rubygem-ruby-4.0.0-ffi-1 \
rubygem-ruby-4.0.0-ffi-1.17 \
rubygem-ruby-4.0.0-ffi-1.17.1"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
