SUMMARY = "Template compilation framework in Ruby"
DESCRIPTION = "Template compilation framework in Ruby."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "ruby4.0-rubygem-temple-0.10.3-1.15.aarch64.rpm"
RPM_HASH = "701b8f5fe662380163ccfc385077c7919abd4df2c58f24f615b61869b706016cb23df8f440bb317fe7f50d12a84d8bd3389d1cfd6ab46daf43e0ced920c301f2"

RPROVIDES:${PN} += "ruby4.0-rubygem-temple \
rubygem-ruby-4.0.0-temple \
rubygem-ruby-4.0.0-temple-0 \
rubygem-ruby-4.0.0-temple-0.10 \
rubygem-ruby-4.0.0-temple-0.10.3 \
rubygem-temple"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
