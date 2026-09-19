SUMMARY = "STDOUT text formatting"
DESCRIPTION = "Ruby STDOUT text formatting"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-formatador-1.1.0-4.19.aarch64.rpm"
RPM_HASH = "ba953f7edfd2b1c367a9cc4ecb7198a6d014ca6d7879b4cec7fff66bbb8f45bd81a1631807f6269231728c809925850fd0a21e9cb22e3b233209ff76c67a5b67"

RPROVIDES:${PN} += "ruby4.0-rubygem-formatador \
rubygem-formatador \
rubygem-ruby-4.0.0-formatador \
rubygem-ruby-4.0.0-formatador-1 \
rubygem-ruby-4.0.0-formatador-1.1 \
rubygem-ruby-4.0.0-formatador-1.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
