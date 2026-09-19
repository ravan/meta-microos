SUMMARY = "A generalized Rack framework for multiple-provider authentication"
DESCRIPTION = "A generalized Rack framework for multiple-provider authentication."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "ruby4.0-rubygem-omniauth-2.1.2-1.11.aarch64.rpm"
RPM_HASH = "78a809d12e3f9f4528fa26d03225f15ee30d0108b93b524a86a767d07180c0b0d56a7b0ef29035c2f40e5a6ac9289a868082c9f00df07a6e56ebf23ab4aec712"

RPROVIDES:${PN} += "ruby4.0-rubygem-omniauth \
rubygem-omniauth \
rubygem-ruby-4.0.0-omniauth \
rubygem-ruby-4.0.0-omniauth-2 \
rubygem-ruby-4.0.0-omniauth-2.1 \
rubygem-ruby-4.0.0-omniauth-2.1.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-hashie \
rubygem-ruby-4.0.0-rack \
rubygem-ruby-4.0.0-rack-protection"

inherit rpm
