SUMMARY = "Ruby bindings for augeas"
DESCRIPTION = "Provides bindings for augeas."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "ruby4.0-rubygem-ruby-augeas-0.6.0-1.13.aarch64.rpm"
RPM_HASH = "ec11aa95c0f7b928b0cf43f9b7ceed1e50466d6c4972ea7c21cd7ede7f5248e6b5898e7d462d496a33dee2611fb477f78619361f5c219505a9d51a66fd849724"

RPROVIDES:${PN} += "ruby4.0-rubygem-ruby-augeas \
rubygem-ruby-4.0.0-ruby-augeas \
rubygem-ruby-4.0.0-ruby-augeas-0 \
rubygem-ruby-4.0.0-ruby-augeas-0.6 \
rubygem-ruby-4.0.0-ruby-augeas-0.6.0 \
rubygem-ruby-augeas"

RDEPENDS:${PN} += "augeas \
ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
libxml2.so.16 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
