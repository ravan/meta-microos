SUMMARY = "New IO for Ruby"
DESCRIPTION = "New IO for Ruby."
LICENSE = "BSD-2-Clause & MIT"

PV = "2.7.4"

RPM_NAME = "ruby4.0-rubygem-nio4r-2.7.4-1.11.aarch64.rpm"
RPM_HASH = "0d771dd57b18235366ef92caf94c83acfcc8f4b28654b444f39ef0dae89fb41282be4f5e706f576491aaf28c93e99cea9f096a660831828b4a56fe1b3bef9c3e"

RPROVIDES:${PN} += "ruby4.0-rubygem-nio4r \
rubygem-nio4r \
rubygem-ruby-4.0.0-nio4r \
rubygem-ruby-4.0.0-nio4r-2 \
rubygem-ruby-4.0.0-nio4r-2.7 \
rubygem-ruby-4.0.0-nio4r-2.7.4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
