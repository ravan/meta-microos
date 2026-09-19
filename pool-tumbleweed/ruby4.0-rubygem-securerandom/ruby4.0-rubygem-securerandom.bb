SUMMARY = "Interface for secure random number generator"
DESCRIPTION = "Interface for secure random number generator."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.4.1"

RPM_NAME = "ruby4.0-rubygem-securerandom-0.4.1-1.8.aarch64.rpm"
RPM_HASH = "f6efea9ada116e459a87bb70887208dfd16a7b4a1be6aca02e709d9a20ce5326ee3c62c3023ce9ffe55749e7350a1552268a6a953c85b19738e206c6f8c94536"

RPROVIDES:${PN} += "ruby4.0-rubygem-securerandom \
rubygem-ruby-4.0.0-securerandom \
rubygem-ruby-4.0.0-securerandom-0 \
rubygem-ruby-4.0.0-securerandom-0.4 \
rubygem-ruby-4.0.0-securerandom-0.4.1 \
rubygem-securerandom"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
