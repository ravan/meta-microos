SUMMARY = "A simple, fast Mysql library for Ruby, binding to libmysql"
DESCRIPTION = "A simple, fast Mysql library for Ruby, binding to libmysql."
LICENSE = "MIT"

PV = "0.5.6"

RPM_NAME = "ruby4.0-rubygem-mysql2-0.5.6-1.12.aarch64.rpm"
RPM_HASH = "c58f601a88285b43715b30a729f4953086ef7eab434b00aae7fb948ff525c73a7d98cda0d7ba668b2d79b337e52b8b0462970729690d8656fa50de6984acb2d8"

RPROVIDES:${PN} += "ruby4.0-rubygem-mysql2 \
rubygem-mysql2 \
rubygem-ruby-4.0.0-mysql2 \
rubygem-ruby-4.0.0-mysql2-0 \
rubygem-ruby-4.0.0-mysql2-0.5 \
rubygem-ruby-4.0.0-mysql2-0.5.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmariadb.so.3 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
