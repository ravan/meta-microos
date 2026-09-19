SUMMARY = "Rake tasks providing tasks to package project in git and integration"
DESCRIPTION = "Rake tasks to allow easy packaging ruby projects in git for Build Service or \
other packaging service."
LICENSE = "LGPL-2.1-only"

PV = "1.5.4"

RPM_NAME = "ruby4.0-rubygem-packaging_rake_tasks-1.5.4-1.15.aarch64.rpm"
RPM_HASH = "2bd3ec5c98d37403ce95c3d463c12286cc202faaf126ba05464ec98bcdfbaf7f352453c6e34d49afecfe867d38ce7998d04c48363d1c7fb224ae3a080513ffe2"

RPROVIDES:${PN} += "ruby4.0-rubygem-packaging-rake-tasks \
rubygem-packaging-rake-tasks \
rubygem-ruby-4.0.0-packaging-rake-tasks \
rubygem-ruby-4.0.0-packaging-rake-tasks-1 \
rubygem-ruby-4.0.0-packaging-rake-tasks-1.5 \
rubygem-ruby-4.0.0-packaging-rake-tasks-1.5.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rake"

inherit rpm
