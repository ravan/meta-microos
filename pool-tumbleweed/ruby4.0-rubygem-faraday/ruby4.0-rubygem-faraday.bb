SUMMARY = "HTTP/REST API client library"
DESCRIPTION = "HTTP/REST API client library."
LICENSE = "MIT"

PV = "2.7.11"

RPM_NAME = "ruby4.0-rubygem-faraday-2.7.11-1.15.aarch64.rpm"
RPM_HASH = "d0e04d77b876f49bc85a53ac89ff5d5b959812ad94d2d5316c83947b9827e2188fce7722237dd511c37e52e2b268ee2ac0526983f9c9c3b7ae5bc25c284762c9"

RPROVIDES:${PN} += "ruby4.0-rubygem-faraday \
rubygem-faraday \
rubygem-ruby-4.0.0-faraday \
rubygem-ruby-4.0.0-faraday-2 \
rubygem-ruby-4.0.0-faraday-2.7 \
rubygem-ruby-4.0.0-faraday-2.7.11"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64 \
rubygem-ruby-4.0.0-faraday-net-http \
rubygem-ruby-4.0.0-ruby2-keywords"

inherit rpm
