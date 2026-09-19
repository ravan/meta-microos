SUMMARY = "Generic connection pool for Ruby"
DESCRIPTION = "Generic connection pool for Ruby."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "ruby4.0-rubygem-connection_pool-3.0.2-1.2.aarch64.rpm"
RPM_HASH = "fcf4b06e236f6afde2099b10c076a6228749e48d5c6798f7603ae86641dbffe7c7452275e0baebe3fc7ca8a15e435a9fcda12163d0cea70489745770d47599fa"

RPROVIDES:${PN} += "ruby4.0-rubygem-connection-pool \
rubygem-connection-pool \
rubygem-ruby-4.0.0-connection-pool \
rubygem-ruby-4.0.0-connection-pool-3 \
rubygem-ruby-4.0.0-connection-pool-3.0 \
rubygem-ruby-4.0.0-connection-pool-3.0.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
