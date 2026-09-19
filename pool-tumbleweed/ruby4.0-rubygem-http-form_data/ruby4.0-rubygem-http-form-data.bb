SUMMARY = "http-form_data-2.3.0"
DESCRIPTION = "Utility-belt to build form data request bodies. Provides support for \
`application/x-www-form-urlencoded` and `multipart/form-data` types."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby4.0-rubygem-http-form_data-2.3.0-1.25.aarch64.rpm"
RPM_HASH = "3107c50a51e904f2dc10ba1313823f6fd5825d8bd79fb1acc745a5257ed6df5d03029c887afff6f054f2f74a1a6caf21e0fc335a3dd194f544d83b27aba5198e"

RPROVIDES:${PN} += "ruby4.0-rubygem-http-form-data \
rubygem-http-form-data \
rubygem-ruby-4.0.0-http-form-data \
rubygem-ruby-4.0.0-http-form-data-2 \
rubygem-ruby-4.0.0-http-form-data-2.3 \
rubygem-ruby-4.0.0-http-form-data-2.3.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
