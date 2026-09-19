SUMMARY = "Create changelog for SLE images for Docker"
DESCRIPTION = "A tool to generate Docker images changelog starting from the .packages \
files created by kiwi."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby4.0-rubygem-changelog_generator-0.3.0-1.37.aarch64.rpm"
RPM_HASH = "9afcb1829116e929c0f29f47f95505282dfeda8c65c18dcaff4ff3122404b165502aec8cb999eda148b427138da05aceeba47b7e9d933e95ade0b927a316fa74"

RPROVIDES:${PN} += "ruby4.0-rubygem-changelog-generator \
rubygem-changelog-generator \
rubygem-ruby-4.0.0-changelog-generator \
rubygem-ruby-4.0.0-changelog-generator-0 \
rubygem-ruby-4.0.0-changelog-generator-0.3 \
rubygem-ruby-4.0.0-changelog-generator-0.3.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rpm"

inherit rpm
