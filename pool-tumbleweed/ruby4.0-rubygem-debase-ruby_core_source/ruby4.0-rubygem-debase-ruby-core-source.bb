SUMMARY = "Provide Ruby core source files"
DESCRIPTION = "Provide Ruby core source files for C extensions that need them."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "ruby4.0-rubygem-debase-ruby_core_source-3.4.1-1.8.aarch64.rpm"
RPM_HASH = "144156e770ca6f16679720bd844278e1f48d9a7c4bc4dfe193fc0a44545df7adc522f482762da2f938227218fbf94b872e9bd8a175ebac697e509c4a449c4a26"

RPROVIDES:${PN} += "ruby4.0-rubygem-debase-ruby-core-source \
rubygem-debase-ruby-core-source \
rubygem-ruby-4.0.0-debase-ruby-core-source \
rubygem-ruby-4.0.0-debase-ruby-core-source-3 \
rubygem-ruby-4.0.0-debase-ruby-core-source-3.4 \
rubygem-ruby-4.0.0-debase-ruby-core-source-3.4.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
