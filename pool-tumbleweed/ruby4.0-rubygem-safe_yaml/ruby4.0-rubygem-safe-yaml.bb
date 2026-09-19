SUMMARY = "SameYAML provides an alternative implementation of YAML.load"
DESCRIPTION = "Parse YAML safely."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ruby4.0-rubygem-safe_yaml-1.0.5-1.34.aarch64.rpm"
RPM_HASH = "5b1e8b593f8afeddb4a47901a92fec1c724e32d6512799fb3a8b76780ed5373eba1da66ebbc46ebdb5a6eecfc073c4870f9caf642be16132e9e8edf5032dcc5e"

RPROVIDES:${PN} += "ruby4.0-rubygem-safe-yaml \
rubygem-ruby-4.0.0-safe-yaml \
rubygem-ruby-4.0.0-safe-yaml-1 \
rubygem-ruby-4.0.0-safe-yaml-1.0 \
rubygem-ruby-4.0.0-safe-yaml-1.0.5 \
rubygem-safe-yaml"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
