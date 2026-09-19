SUMMARY = "JSON Implementation for Ruby"
DESCRIPTION = "This is a JSON implementation in pure Ruby."
LICENSE = "Ruby"

PV = "2.7.6"

RPM_NAME = "ruby4.0-rubygem-json_pure-2.7.6-1.10.aarch64.rpm"
RPM_HASH = "735aee4f82d8e7655a8b29d37bf94f67de1999a9b66f378eff4d8cc95a659450d755229932a6a7164ca0e64f6cf8a74979c24190b3d5c8c9a28342fb5eedb979"

RPROVIDES:${PN} += "ruby4.0-rubygem-json-pure \
rubygem-json-pure \
rubygem-ruby-4.0.0-json-pure \
rubygem-ruby-4.0.0-json-pure-2 \
rubygem-ruby-4.0.0-json-pure-2.7 \
rubygem-ruby-4.0.0-json-pure-2.7.6"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
