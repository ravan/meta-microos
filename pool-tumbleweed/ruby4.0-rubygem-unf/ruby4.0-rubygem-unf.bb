SUMMARY = "A wrapper library to bring Unicode Normalization Form support to"
DESCRIPTION = "This is a wrapper library to bring Unicode Normalization Form support \
to Ruby/JRuby."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "ruby4.0-rubygem-unf-0.2.0-1.11.aarch64.rpm"
RPM_HASH = "d79efa97ee17c7c903c6a68b09c2352c0ec27a7f0822588eb7e38e5edb3595b7cca7de5947d7c3bbf033b3298198b044802c661576643660c93ba0a5edbeaab2"

RPROVIDES:${PN} += "ruby4.0-rubygem-unf \
rubygem-ruby-4.0.0-unf \
rubygem-ruby-4.0.0-unf-0 \
rubygem-ruby-4.0.0-unf-0.2 \
rubygem-ruby-4.0.0-unf-0.2.0 \
rubygem-unf"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
