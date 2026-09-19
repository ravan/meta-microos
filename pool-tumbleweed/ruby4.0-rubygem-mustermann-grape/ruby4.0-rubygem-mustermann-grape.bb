SUMMARY = "Grape syntax for Mustermann"
DESCRIPTION = "Adds Grape style patterns to Mustermman."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-mustermann-grape-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "eee131a91640a3afade54838e17f8433b8fdd87d5e74f63c26c5788dbbe0e4a30de746433c8707f2b10016b24a4a501a88a34053872e583d43924d6f01283e75"

RPROVIDES:${PN} += "ruby4.0-rubygem-mustermann-grape \
rubygem-mustermann-grape \
rubygem-ruby-4.0.0-mustermann-grape \
rubygem-ruby-4.0.0-mustermann-grape-1 \
rubygem-ruby-4.0.0-mustermann-grape-1.1 \
rubygem-ruby-4.0.0-mustermann-grape-1.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-mustermann"

inherit rpm
