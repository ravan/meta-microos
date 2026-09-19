SUMMARY = "A common interface to multiple JSON libraries"
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON \
gem (with C-extensions), the pure-Ruby JSON gem, NSJSONSerialization, gson.rb, \
JrJackson, and OkJson."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "ruby4.0-rubygem-multi_json-1.15.0-1.29.aarch64.rpm"
RPM_HASH = "bd1163b87b38b62dca3aa86b3ff6baea7deb6c291d574e95ba7b78f02cfd586b1d49a19d72c0ef2ba600bf8bfae2e43a6e99aea04cc3b7199954e7708fb38975"

RPROVIDES:${PN} += "ruby4.0-rubygem-multi-json \
rubygem-multi-json \
rubygem-ruby-4.0.0-multi-json \
rubygem-ruby-4.0.0-multi-json-1 \
rubygem-ruby-4.0.0-multi-json-1.15 \
rubygem-ruby-4.0.0-multi-json-1.15.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
