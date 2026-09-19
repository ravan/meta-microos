SUMMARY = "A class based configuration library"
DESCRIPTION = "A class based configuration library."
LICENSE = "Apache-2.0"

PV = "3.0.27"

RPM_NAME = "ruby4.0-rubygem-mixlib-config-3.0.27-1.19.aarch64.rpm"
RPM_HASH = "34b2613c3a5287d77ead309abd5e10dea12c22fd28f9f9128e407d39279dc7b8130ef78f982c2904fa58981f62253973ca43590be3d6eeb1bc24eb9460efc0ea"

RPROVIDES:${PN} += "ruby4.0-rubygem-mixlib-config \
rubygem-mixlib-config \
rubygem-ruby-4.0.0-mixlib-config \
rubygem-ruby-4.0.0-mixlib-config-3 \
rubygem-ruby-4.0.0-mixlib-config-3.0 \
rubygem-ruby-4.0.0-mixlib-config-3.0.27"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-tomlrb"

inherit rpm
