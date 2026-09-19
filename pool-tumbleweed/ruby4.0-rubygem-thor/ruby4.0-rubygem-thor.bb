SUMMARY = "Thor is a toolkit for building powerful command-line interfaces"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-thor-1.4.0-1.7.aarch64.rpm"
RPM_HASH = "3db9b2aa28b2a4c427700e2686c9950e8926f425490ca1491bc0fa0e9c84c20be86d706cb78c72b080796c1918537641015ac5bfa6f7e4db4a29a54bcdd38cce"

RPROVIDES:${PN} += "ruby4.0-rubygem-thor \
rubygem-ruby-4.0.0-thor \
rubygem-ruby-4.0.0-thor-1 \
rubygem-ruby-4.0.0-thor-1.4 \
rubygem-ruby-4.0.0-thor-1.4.0 \
rubygem-thor"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
