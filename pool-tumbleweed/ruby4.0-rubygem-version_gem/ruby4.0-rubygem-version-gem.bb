SUMMARY = "Enhance your VERSION! Sugar for Version modules"
DESCRIPTION = "Versions are good. Versions are cool. Versions will win."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ruby4.0-rubygem-version_gem-1.1.4-1.11.aarch64.rpm"
RPM_HASH = "f70a1d4744173b17c53f5eaa99782c414aa1bf6026161920686f6c228ae5b0d9f595cff7c9628062f9d51029ceb76729318c11b4667fc5c61be56d056ef960c9"

RPROVIDES:${PN} += "ruby4.0-rubygem-version-gem \
rubygem-ruby-4.0.0-version-gem \
rubygem-ruby-4.0.0-version-gem-1 \
rubygem-ruby-4.0.0-version-gem-1.1 \
rubygem-ruby-4.0.0-version-gem-1.1.4 \
rubygem-version-gem"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
