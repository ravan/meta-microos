SUMMARY = "Turbolinks makes navigating your web application faster"
DESCRIPTION = "Rails engine for Turbolinks 5 support."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ruby4.0-rubygem-turbolinks-5.2.1-1.31.aarch64.rpm"
RPM_HASH = "94c72261fab4d86e9f00a4f6424e48d139762bc2d709ae4651f591a0fc2d3ee895f1c680e9c67df2b75e5dfcd7e3782f82886aa9ac5d1e4d33ab34f0ef039fc6"

RPROVIDES:${PN} += "ruby4.0-rubygem-turbolinks \
rubygem-ruby-4.0.0-turbolinks \
rubygem-ruby-4.0.0-turbolinks-5 \
rubygem-ruby-4.0.0-turbolinks-5.2 \
rubygem-ruby-4.0.0-turbolinks-5.2.1 \
rubygem-turbolinks"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-turbolinks-source-5"

inherit rpm
