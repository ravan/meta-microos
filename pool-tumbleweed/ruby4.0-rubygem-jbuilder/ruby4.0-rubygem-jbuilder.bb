SUMMARY = "Create JSON structures via a Builder-style DSL"
DESCRIPTION = "Create JSON structures via a Builder-style DSL."
LICENSE = "MIT"

PV = "2.13.0"

RPM_NAME = "ruby4.0-rubygem-jbuilder-2.13.0-1.10.aarch64.rpm"
RPM_HASH = "00f894435ac02d7c009222ebf59fdb5096351b78349c3eafc5f99526e3b92ebf5dd227e58b0ce8e892b7c8c1918e6d511579dc96cbb313f45e966f3660a1c811"

RPROVIDES:${PN} += "ruby4.0-rubygem-jbuilder \
rubygem-jbuilder \
rubygem-ruby-4.0.0-jbuilder \
rubygem-ruby-4.0.0-jbuilder-2 \
rubygem-ruby-4.0.0-jbuilder-2.13 \
rubygem-ruby-4.0.0-jbuilder-2.13.0"

RDEPENDS:${PN} += "/usr/bin/bash \
ruby-abi \
rubygem-ruby-4.0.0-actionview \
rubygem-ruby-4.0.0-activesupport"

inherit rpm
