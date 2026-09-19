SUMMARY = "Simple Lightweight Option Parsing"
DESCRIPTION = "A DSL for gathering options and parsing command line flags."
LICENSE = "MIT"

PV = "4.10.1"

RPM_NAME = "ruby4.0-rubygem-slop-4.10.1-1.15.aarch64.rpm"
RPM_HASH = "ca90e644519736d00cad53baf3ba528c5256cfb74e9d628b07888a3059695331e3e4309350abc7c921bdfd3b52abf8392b4d3525483affe14bcd693fac736758"

RPROVIDES:${PN} += "ruby4.0-rubygem-slop \
rubygem-ruby-4.0.0-slop \
rubygem-ruby-4.0.0-slop-4 \
rubygem-ruby-4.0.0-slop-4.10 \
rubygem-ruby-4.0.0-slop-4.10.1 \
rubygem-slop"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
