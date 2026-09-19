SUMMARY = "Pg is the Ruby interface to the PostgreSQL RDBMS"
DESCRIPTION = "Pg is the Ruby interface to the PostgreSQL RDBMS. It works with PostgreSQL 9.3 \
and later."
LICENSE = "BSD-2-Clause"

PV = "1.5.9"

RPM_NAME = "ruby4.0-rubygem-pg-1.5.9-1.11.aarch64.rpm"
RPM_HASH = "40f8591da7ec2f75199bbd41a5e43d4eee2c5d777f25fd9aebd8bdc90e023dd1db68f10e6e7657cd84bc503cca9edbf3aa18a496f7de692467442dd61bb3c73f"

RPROVIDES:${PN} += "ruby4.0-rubygem-pg \
rubygem-pg \
rubygem-ruby-4.0.0-pg \
rubygem-ruby-4.0.0-pg-1 \
rubygem-ruby-4.0.0-pg-1.5 \
rubygem-ruby-4.0.0-pg-1.5.9"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpq.so.5 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
