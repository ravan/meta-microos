SUMMARY = "Module to define equality, equivalence and inspection methods"
DESCRIPTION = "Module to define equality, equivalence and inspection methods."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby4.0-rubygem-dry-equalizer-0.3.0-1.30.aarch64.rpm"
RPM_HASH = "9abcdf4e458dddbf616d7e49a9c0de8726780504a0d0e140f66398c59ffd16a6b9b7bf2174e674c02c5d74261bd1fe9ce19380d16e79994e8696c04eae5eb2a1"

RPROVIDES:${PN} += "ruby4.0-rubygem-dry-equalizer \
rubygem-dry-equalizer \
rubygem-ruby-4.0.0-dry-equalizer \
rubygem-ruby-4.0.0-dry-equalizer-0 \
rubygem-ruby-4.0.0-dry-equalizer-0.3 \
rubygem-ruby-4.0.0-dry-equalizer-0.3.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
