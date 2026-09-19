SUMMARY = "A simple REST client for the Docker Remote API"
DESCRIPTION = "A simple REST client for the Docker Remote API."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-docker-api-2.4.0-1.10.aarch64.rpm"
RPM_HASH = "23169056989d93846386f24d266f15dd81c1cafd5c784a4d169d09aad8495bbec8e124f2c3ba40d73ef4c650414fe3d51ce1b56b0b5e6fb68faa32a9252680d3"

RPROVIDES:${PN} += "ruby4.0-rubygem-docker-api \
rubygem-docker-api \
rubygem-ruby-4.0.0-docker-api \
rubygem-ruby-4.0.0-docker-api-2 \
rubygem-ruby-4.0.0-docker-api-2.4 \
rubygem-ruby-4.0.0-docker-api-2.4.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-excon \
rubygem-ruby-4.0.0-multi-json"

inherit rpm
