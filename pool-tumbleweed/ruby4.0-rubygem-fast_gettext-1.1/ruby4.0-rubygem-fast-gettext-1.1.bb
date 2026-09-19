SUMMARY = "A simple, fast, memory-efficient and threadsafe implementation of"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText."
LICENSE = "MIT & Ruby"

PV = "1.1.2"

RPM_NAME = "ruby4.0-rubygem-fast_gettext-1.1-1.1.2-1.31.aarch64.rpm"
RPM_HASH = "4dc10bcdb2b87d6f119a179660177ebbc3a7855e82824d735ec6c8cf0e5ffa61c1a3047a8321c27b88e6a0a5cda17efdac3223b7c709077e3f271ed61c2dfa3a"

RPROVIDES:${PN} += "ruby4.0-rubygem-fast-gettext-1.1 \
rubygem-fast-gettext \
rubygem-ruby-4.0.0-fast-gettext \
rubygem-ruby-4.0.0-fast-gettext-1 \
rubygem-ruby-4.0.0-fast-gettext-1.1 \
rubygem-ruby-4.0.0-fast-gettext-1.1.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
