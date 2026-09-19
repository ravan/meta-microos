SUMMARY = "A pure Ruby implementation of the SCP client protocol"
DESCRIPTION = "A pure Ruby implementation of the SCP client protocol."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby4.0-rubygem-net-scp-4.0.0-1.19.aarch64.rpm"
RPM_HASH = "d1907c9de51e19018bc1b419ff8489a02bcdf804dcc85374d9c2f10b158ab1756a09c8bb287d8e9daea8b82c1b89f09f89b07259294543fbaca3c641f611648e"

RPROVIDES:${PN} += "ruby4.0-rubygem-net-scp \
rubygem-net-scp \
rubygem-ruby-4.0.0-net-scp \
rubygem-ruby-4.0.0-net-scp-4 \
rubygem-ruby-4.0.0-net-scp-4.0 \
rubygem-ruby-4.0.0-net-scp-4.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-net-ssh"

inherit rpm
