SUMMARY = "A pkg-config implementation for Ruby"
DESCRIPTION = "pkg-config can be used in your extconf.rb to properly detect need libraries \
for compiling Ruby native extensions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.7"

RPM_NAME = "ruby4.0-rubygem-pkg-config-1.5.7-1.10.aarch64.rpm"
RPM_HASH = "156d5582ba1d64473caf70f7b4c4edeb06837c21f4437499b34a7875676318305313e4e1cf895db8318d710151dd34fb63b0f9795ba4214f0a6e9be00ab57961"

RPROVIDES:${PN} += "ruby4.0-rubygem-pkg-config \
rubygem-pkg-config \
rubygem-ruby-4.0.0-pkg-config \
rubygem-ruby-4.0.0-pkg-config-1 \
rubygem-ruby-4.0.0-pkg-config-1.5 \
rubygem-ruby-4.0.0-pkg-config-1.5.7"

RDEPENDS:${PN} += "pkg-config \
ruby-abi"

inherit rpm
