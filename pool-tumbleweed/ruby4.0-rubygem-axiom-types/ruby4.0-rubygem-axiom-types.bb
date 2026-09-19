SUMMARY = "Abstract types for logic programming"
DESCRIPTION = "Define types with optional constraints for use within axiom and other \
libraries."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ruby4.0-rubygem-axiom-types-0.1.1-1.45.aarch64.rpm"
RPM_HASH = "43801c8e61eee568b50f2e8aef2865c41572cf84ef55960dfab46a00063d2e037e8c0715003d1f0ffd96bf7e972a39058e68f93e432c2554e465304ffba64865"

RPROVIDES:${PN} += "ruby4.0-rubygem-axiom-types \
rubygem-axiom-types \
rubygem-ruby-4.0.0-axiom-types \
rubygem-ruby-4.0.0-axiom-types-0 \
rubygem-ruby-4.0.0-axiom-types-0.1 \
rubygem-ruby-4.0.0-axiom-types-0.1.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-descendants-tracker-0.0 \
rubygem-ruby-4.0.0-ice-nine-0.11 \
rubygem-ruby-4.0.0-thread-safe \
rubygem-ruby-4.0.0-thread-safe-0"

inherit rpm
