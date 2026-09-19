SUMMARY = "Auto-terminate potentially long-running operations in Ruby"
DESCRIPTION = "Auto-terminate potentially long-running operations in Ruby."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.6.1"

RPM_NAME = "ruby4.0-rubygem-timeout-0.6.1-1.2.aarch64.rpm"
RPM_HASH = "c76e1eb5aea8395dd63a8834f955ac6fd105a01ea4ed430612cf2911fa0438d9edb99abad208d1c1716b1d8ed00bc59b52158ab6dfd19a737c489d5276f4b466"

RPROVIDES:${PN} += "ruby4.0-rubygem-timeout \
rubygem-ruby-4.0.0-timeout \
rubygem-ruby-4.0.0-timeout-0 \
rubygem-ruby-4.0.0-timeout-0.6 \
rubygem-ruby-4.0.0-timeout-0.6.1 \
rubygem-timeout"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
