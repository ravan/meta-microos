SUMMARY = "API to express expected outcomes of a code example"
DESCRIPTION = "rspec-expectations provides a simple, readable API to express expected \
outcomes of a code example."
LICENSE = "MIT"

PV = "3.13.3"

RPM_NAME = "ruby4.0-rubygem-rspec-expectations-3.13.3-1.10.aarch64.rpm"
RPM_HASH = "4d1f5422de86d8458777a24ca395fea9ff5c721766ad096a2d3d79758f61d658ed9c274705648b031f390b84a8aa8018d9ca5da91394073d79538fe2ecfcf2e5"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec-expectations \
rubygem-rspec-expectations \
rubygem-ruby-4.0.0-rspec-expectations \
rubygem-ruby-4.0.0-rspec-expectations-3 \
rubygem-ruby-4.0.0-rspec-expectations-3.13 \
rubygem-ruby-4.0.0-rspec-expectations-3.13.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-diff-lcs \
rubygem-ruby-4.0.0-rspec-support-3.13"

inherit rpm
