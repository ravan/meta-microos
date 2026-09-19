SUMMARY = "orm_adapter provides a single point of entry for using basic"
DESCRIPTION = "Provides a single point of entry for using basic features of ruby ORMs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "ruby4.0-rubygem-orm_adapter-0.5.0-4.42.aarch64.rpm"
RPM_HASH = "19e1fd4bcda0a22d41d05e1c3676092c59fd1a3a1ca59898b947d3c3ded652cd6efe1ca04c064f8d2551feef1ed867a3b9c64d54c95234a2b60462d7b209578d"

RPROVIDES:${PN} += "ruby4.0-rubygem-orm-adapter \
rubygem-orm-adapter \
rubygem-ruby-4.0.0-orm-adapter \
rubygem-ruby-4.0.0-orm-adapter-0 \
rubygem-ruby-4.0.0-orm-adapter-0.5 \
rubygem-ruby-4.0.0-orm-adapter-0.5.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
