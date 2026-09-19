SUMMARY = "Ruby library to interface with the SQLite3 database engine"
DESCRIPTION = "Ruby library to interface with the SQLite3 database engine \
(http://www.sqlite.org). Precompiled \
binaries are available for common platforms for recent versions of Ruby."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "ruby4.0-rubygem-sqlite3-2.1.0-1.12.aarch64.rpm"
RPM_HASH = "1990c2991a0ebfaaee7f188e140ee8e147de8e4dc8c4ffa0674ecfb8ce82279d80f194a9846e0e6a647f75cbba6ac0d39b9ee960a44613a1326f40fa986e3cce"

RPROVIDES:${PN} += "ruby4.0-rubygem-sqlite3 \
rubygem-ruby-4.0.0-sqlite3 \
rubygem-ruby-4.0.0-sqlite3-2 \
rubygem-ruby-4.0.0-sqlite3-2.1 \
rubygem-ruby-4.0.0-sqlite3-2.1.0 \
rubygem-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
libsqlite3.so.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
