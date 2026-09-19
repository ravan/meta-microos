SUMMARY = "A simple API for XML processing"
DESCRIPTION = "A simple API for XML processing."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "ruby4.0-rubygem-xml-simple-1.1.9-1.23.aarch64.rpm"
RPM_HASH = "ff2fe576863257196e9a19e40538b87d73a8d051c51354e9a91327cb17e78d3526dddbaa2eebe69e85f29c28e9639277ffc5a90bf2695b908af161eec2a87c16"

RPROVIDES:${PN} += "ruby4.0-rubygem-xml-simple \
rubygem-ruby-4.0.0-xml-simple \
rubygem-ruby-4.0.0-xml-simple-1 \
rubygem-ruby-4.0.0-xml-simple-1.1 \
rubygem-ruby-4.0.0-xml-simple-1.1.9 \
rubygem-xml-simple"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rexml"

inherit rpm
