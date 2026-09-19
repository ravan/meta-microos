SUMMARY = "Simple autoconf and cmake builder for developers"
DESCRIPTION = "Simple autoconf and cmake builder for developers. It provides a standard way \
to compile against \
dependency libraries without requiring system-wide installation. It also \
simplifies \
vendoring and cross-compilation by providing a consistent build interface."
LICENSE = "MIT"

PV = "2.8.7"

RPM_NAME = "ruby4.0-rubygem-mini_portile2-2.8.7-1.11.aarch64.rpm"
RPM_HASH = "67c1572cc5a66f403d5b02ea2dafaf4f5a5dd9ef9881e93e7b1f29bb86716914642f3f1b8c2f033ddb7faccb4eae872bef70a92740986537f4d2c920811b88cd"

RPROVIDES:${PN} += "ruby4.0-rubygem-mini-portile2 \
rubygem-mini-portile2 \
rubygem-ruby-4.0.0-mini-portile2 \
rubygem-ruby-4.0.0-mini-portile2-2 \
rubygem-ruby-4.0.0-mini-portile2-2.8 \
rubygem-ruby-4.0.0-mini-portile2-2.8.7"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
