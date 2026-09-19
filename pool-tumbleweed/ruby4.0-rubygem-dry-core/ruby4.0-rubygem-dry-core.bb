SUMMARY = "A toolset of small support modules used throughout the dry-rb"
DESCRIPTION = "A toolset of small support modules used throughout the dry-rb ecosystem."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-dry-core-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "07db3def70192e1e2f42f72482aa499002253e8fd1ba6a7818e913230c5f36468e29247afcb4b8b88f735df9bdcdcc7caaa67065b92315a4c048744b289bec93"

RPROVIDES:${PN} += "ruby4.0-rubygem-dry-core \
rubygem-dry-core \
rubygem-ruby-4.0.0-dry-core \
rubygem-ruby-4.0.0-dry-core-1 \
rubygem-ruby-4.0.0-dry-core-1.1 \
rubygem-ruby-4.0.0-dry-core-1.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-logger \
rubygem-ruby-4.0.0-zeitwerk-2"

inherit rpm
