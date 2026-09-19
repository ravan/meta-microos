SUMMARY = "Punycode ACE to unicode UTF-8 (and vice-versa) string conversion"
DESCRIPTION = "This gem allows easy conversion from punycode ACE strings to unicode UTF-8 \
strings and vice-versa."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "ruby4.0-rubygem-simpleidn-0.2.3-1.11.aarch64.rpm"
RPM_HASH = "1542f752061b4fe5265a8ccb9caa233c67fc3396bbb6a6f3933a3b0ae7c7be9651961bb448bf4a740da245f980e711107899cba652dd8b8af3eae19a128aa446"

RPROVIDES:${PN} += "ruby4.0-rubygem-simpleidn \
rubygem-ruby-4.0.0-simpleidn \
rubygem-ruby-4.0.0-simpleidn-0 \
rubygem-ruby-4.0.0-simpleidn-0.2 \
rubygem-ruby-4.0.0-simpleidn-0.2.3 \
rubygem-simpleidn"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
