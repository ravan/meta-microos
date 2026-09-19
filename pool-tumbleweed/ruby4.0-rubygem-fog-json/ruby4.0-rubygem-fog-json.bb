SUMMARY = "JSON parsing for fog providers"
DESCRIPTION = "Extraction of the JSON parsing tools shared between a \
number of providers in the 'fog' gem."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ruby4.0-rubygem-fog-json-1.2.0-1.31.aarch64.rpm"
RPM_HASH = "c02e896275920eb98ec610359a350c4cb32e662ea0af4580e098ac4071fba552180e02baaf80b49fd6d0f600ed37dda5f8c319856109d55f3c95c398aec021b5"

RPROVIDES:${PN} += "ruby4.0-rubygem-fog-json \
rubygem-fog-json \
rubygem-ruby-4.0.0-fog-json \
rubygem-ruby-4.0.0-fog-json-1 \
rubygem-ruby-4.0.0-fog-json-1.2 \
rubygem-ruby-4.0.0-fog-json-1.2.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-fog-core \
rubygem-ruby-4.0.0-multi-json-1"

inherit rpm
