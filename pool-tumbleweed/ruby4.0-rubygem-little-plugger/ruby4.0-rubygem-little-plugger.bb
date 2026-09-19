SUMMARY = "LittlePlugger is a module that provides Gem based plugin management"
DESCRIPTION = "LittlePlugger is a module that provides Gem based plugin management. \
By extending your own class or module with LittlePlugger you can easily \
manage the loading and initializing of plugins provided by other gems."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ruby4.0-rubygem-little-plugger-1.1.4-1.39.aarch64.rpm"
RPM_HASH = "94dd9e3e2ed707abda2995ca614432999aefaa5b3cdbc2234bd0a6341a10310d7064d8cca485bf282de683421412398f749f377aef0ff53f00589139f832f732"

RPROVIDES:${PN} += "ruby4.0-rubygem-little-plugger \
rubygem-little-plugger \
rubygem-ruby-4.0.0-little-plugger \
rubygem-ruby-4.0.0-little-plugger-1 \
rubygem-ruby-4.0.0-little-plugger-1.1 \
rubygem-ruby-4.0.0-little-plugger-1.1.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
