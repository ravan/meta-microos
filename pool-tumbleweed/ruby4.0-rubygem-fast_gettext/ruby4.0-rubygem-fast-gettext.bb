SUMMARY = "A simple, fast, memory-efficient and threadsafe implementation of"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText."
LICENSE = "MIT & Ruby"

PV = "2.3.0"

RPM_NAME = "ruby4.0-rubygem-fast_gettext-2.3.0-1.15.aarch64.rpm"
RPM_HASH = "c842d6c37b1a7d9e968a4a1c6bfcc78cbf7950c96afbbccb15dd1e4ccd8128f7453b7fde28f5ea51c193e1a5539ca245d912472448ad4470689c209a1633e620"

RPROVIDES:${PN} += "ruby4.0-rubygem-fast-gettext \
rubygem-fast-gettext \
rubygem-ruby-4.0.0-fast-gettext \
rubygem-ruby-4.0.0-fast-gettext-2 \
rubygem-ruby-4.0.0-fast-gettext-2.3 \
rubygem-ruby-4.0.0-fast-gettext-2.3.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
