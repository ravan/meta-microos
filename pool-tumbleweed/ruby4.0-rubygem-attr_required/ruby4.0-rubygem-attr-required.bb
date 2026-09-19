SUMMARY = "attr_required and attr_optional"
DESCRIPTION = "attr_required and attr_optional."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "ruby4.0-rubygem-attr_required-1.0.2-1.11.aarch64.rpm"
RPM_HASH = "3a3a08086729a03d718d1a6ef9193efe22a86ca7e4f965162f815bfdbc3790b0c1c19810480696d3b8363c2dd1a007b93b652517312324e4a64710cc78a16e13"

RPROVIDES:${PN} += "ruby4.0-rubygem-attr-required \
rubygem-attr-required \
rubygem-ruby-4.0.0-attr-required \
rubygem-ruby-4.0.0-attr-required-1 \
rubygem-ruby-4.0.0-attr-required-1.0 \
rubygem-ruby-4.0.0-attr-required-1.0.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
