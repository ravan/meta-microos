SUMMARY = "Basic utility functions for Core Chef Infra development"
DESCRIPTION = "Basic utility functions for Core Chef Infra development."
LICENSE = "Apache-2.0"

PV = "18.5.0"

RPM_NAME = "ruby4.0-rubygem-chef-utils-18.5.0-1.10.aarch64.rpm"
RPM_HASH = "91103910d1d6d07c6d1b772c6f582f26a6fa4259d957a83b819acf02d7618f42ef4d103c188703638df5bef87747472c6dbca0df3e9d8d5bc7e16d2900772e69"

RPROVIDES:${PN} += "ruby4.0-rubygem-chef-utils \
rubygem-chef-utils \
rubygem-ruby-4.0.0-chef-utils \
rubygem-ruby-4.0.0-chef-utils-18 \
rubygem-ruby-4.0.0-chef-utils-18.5 \
rubygem-ruby-4.0.0-chef-utils-18.5.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby"

inherit rpm
