SUMMARY = "Faraday adapter for Net::HTTP"
DESCRIPTION = "Faraday adapter for Net::HTTP."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "ruby4.0-rubygem-faraday-net_http-3.0.2-1.17.aarch64.rpm"
RPM_HASH = "84c0eb04cbb9b18a3494e069687e999c2c6c4b6e0061aeb365ca25e55cf9e16d7eef40dfd1dc35f3007c2e775b8d106de4d58d30a264590d0b9d1fab0c573242"

RPROVIDES:${PN} += "ruby4.0-rubygem-faraday-net-http \
rubygem-faraday-net-http \
rubygem-ruby-4.0.0-faraday-net-http \
rubygem-ruby-4.0.0-faraday-net-http-3 \
rubygem-ruby-4.0.0-faraday-net-http-3.0 \
rubygem-ruby-4.0.0-faraday-net-http-3.0.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
