SUMMARY = "HighLine is a high-level command-line IO library"
DESCRIPTION = "A high-level IO library that provides validation, type conversion, and more \
for \
command-line interfaces. HighLine also includes a complete menu system that \
can \
crank out anything from simple list selection to complete shells with just \
minutes of work."
LICENSE = "Ruby"

PV = "2.1.0"

RPM_NAME = "ruby4.0-rubygem-highline-2.1.0-1.15.aarch64.rpm"
RPM_HASH = "5b5c202354f9339ca391921a6499bc1469b1ba611732fc83ecb5de55eecee92675000186f58b03df1254795797058f6df06d5023a82c9f4b81d97f1f81fb25f0"

RPROVIDES:${PN} += "ruby4.0-rubygem-highline \
rubygem-highline \
rubygem-ruby-4.0.0-highline \
rubygem-ruby-4.0.0-highline-2 \
rubygem-ruby-4.0.0-highline-2.1 \
rubygem-ruby-4.0.0-highline-2.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
