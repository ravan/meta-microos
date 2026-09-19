SUMMARY = "Turbolinks JavaScript assets"
DESCRIPTION = "Turbolinks JavaScript assets."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "ruby4.0-rubygem-turbolinks-source-5.2.0-1.35.aarch64.rpm"
RPM_HASH = "b1e63a8383fce426039cc4d57daff590dbb66efc83230f3cae832b779d5f371a64da182ca09057c616313520f1f4d02d5104eb0e675e976144170762ebceee33"

RPROVIDES:${PN} += "ruby4.0-rubygem-turbolinks-source \
rubygem-ruby-4.0.0-turbolinks-source \
rubygem-ruby-4.0.0-turbolinks-source-5 \
rubygem-ruby-4.0.0-turbolinks-source-5.2 \
rubygem-ruby-4.0.0-turbolinks-source-5.2.0 \
rubygem-turbolinks-source"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
