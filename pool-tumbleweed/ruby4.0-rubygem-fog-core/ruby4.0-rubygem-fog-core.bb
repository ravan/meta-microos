SUMMARY = "Shared classes and tests for fog providers and services"
DESCRIPTION = "Shared classes and tests for fog providers and services."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "ruby4.0-rubygem-fog-core-2.6.0-1.10.aarch64.rpm"
RPM_HASH = "476aa25ccceb31b74cdd4f54fa152b772507e0af9316fceb8832061bf0324495119060d5d9536932928270f480bba5b7fc269bf73072af760191c3967ea37cb6"

RPROVIDES:${PN} += "ruby4.0-rubygem-fog-core \
rubygem-fog-core \
rubygem-ruby-4.0.0-fog-core \
rubygem-ruby-4.0.0-fog-core-2 \
rubygem-ruby-4.0.0-fog-core-2.6 \
rubygem-ruby-4.0.0-fog-core-2.6.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-builder \
rubygem-ruby-4.0.0-excon-1 \
rubygem-ruby-4.0.0-formatador \
rubygem-ruby-4.0.0-mime-types"

inherit rpm
