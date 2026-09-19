SUMMARY = "ServerEngine - multiprocess server framework"
DESCRIPTION = "A framework to implement robust multiprocess servers like Unicorn."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-serverengine-2.4.0-1.10.aarch64.rpm"
RPM_HASH = "27ca59ed1c514742be22da0a1909d1aee19cd00c3c5634e91e1fc9a7d712b993abd9f15467ff703110524ecf541e563b8c29e7d86dcc1026fa0e01650455f3e0"

RPROVIDES:${PN} += "ruby4.0-rubygem-serverengine \
rubygem-ruby-4.0.0-serverengine \
rubygem-ruby-4.0.0-serverengine-2 \
rubygem-ruby-4.0.0-serverengine-2.4 \
rubygem-ruby-4.0.0-serverengine-2.4.0 \
rubygem-serverengine"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64-0 \
rubygem-ruby-4.0.0-logger-1 \
rubygem-ruby-4.0.0-sigdump-0.2"

inherit rpm
