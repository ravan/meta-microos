SUMMARY = "Markdown that smells nice"
DESCRIPTION = "A fast, safe and extensible Markdown to (X)HTML parser."
LICENSE = "MIT"

PV = "3.6.1"

RPM_NAME = "ruby4.0-rubygem-redcarpet-3.6.1-1.9.aarch64.rpm"
RPM_HASH = "759e400b5889ba05c866d867d577086b355b550bc2e8337d83f2ff738dbb3bb8128225aa260c622f6db984e332dddfabeb3f77a8893272a0c841005b394ec6c1"

RPROVIDES:${PN} += "ruby4.0-rubygem-redcarpet \
rubygem-redcarpet \
rubygem-ruby-4.0.0-redcarpet \
rubygem-ruby-4.0.0-redcarpet-3 \
rubygem-ruby-4.0.0-redcarpet-3.6 \
rubygem-ruby-4.0.0-redcarpet-3.6.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
