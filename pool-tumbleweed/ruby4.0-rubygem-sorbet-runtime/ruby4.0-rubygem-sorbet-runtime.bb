SUMMARY = "Sorbet runtime"
DESCRIPTION = "Sorbet's runtime type checking component."
LICENSE = "Apache-2.0"

PV = "0.6.13341"

RPM_NAME = "ruby4.0-rubygem-sorbet-runtime-0.6.13341-1.2.aarch64.rpm"
RPM_HASH = "f0aacbd74407f48d50ba85c57da43fa374fedeaed9708b9d41f0b4b90b6ac5d678d3c51621702a78ab48eaec9fc2e8900aa9c66c62fa74dd80aa9c1d84d69a85"

RPROVIDES:${PN} += "ruby4.0-rubygem-sorbet-runtime \
rubygem-ruby-4.0.0-sorbet-runtime \
rubygem-ruby-4.0.0-sorbet-runtime-0 \
rubygem-ruby-4.0.0-sorbet-runtime-0.6 \
rubygem-ruby-4.0.0-sorbet-runtime-0.6.13341 \
rubygem-sorbet-runtime"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
