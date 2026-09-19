SUMMARY = "A convenient way to diff string in ruby"
DESCRIPTION = "Convenient diffing in ruby."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "ruby4.0-rubygem-diffy-3.4.3-1.10.aarch64.rpm"
RPM_HASH = "aee1c2290ad3beb0e16648f738a15b2400d5da9ee6a3421fde14cf78caa9a23cb7f183f71c8c13cf7dcbef79b4e8bd471161391541ff4f1ae2ef10d732262b67"

RPROVIDES:${PN} += "ruby4.0-rubygem-diffy \
rubygem-diffy \
rubygem-ruby-4.0.0-diffy \
rubygem-ruby-4.0.0-diffy-3 \
rubygem-ruby-4.0.0-diffy-3.4 \
rubygem-ruby-4.0.0-diffy-3.4.3"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
