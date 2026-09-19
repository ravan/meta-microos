SUMMARY = "Module that adds descendant tracking to a class"
DESCRIPTION = "Module that adds descendant tracking to a class."
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "ruby4.0-rubygem-descendants_tracker-0.0.4-1.46.aarch64.rpm"
RPM_HASH = "15f31185919519137297ad7230be14aae7c1dcb12a248cd549a88df8aab0d11b045aaf28cc7f87f7ef8f8e47c1a65082f76cf684bebd69cd80c234597ab65f9d"

RPROVIDES:${PN} += "ruby4.0-rubygem-descendants-tracker \
rubygem-descendants-tracker \
rubygem-ruby-4.0.0-descendants-tracker \
rubygem-ruby-4.0.0-descendants-tracker-0 \
rubygem-ruby-4.0.0-descendants-tracker-0.0 \
rubygem-ruby-4.0.0-descendants-tracker-0.0.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-thread-safe \
rubygem-ruby-4.0.0-thread-safe-0"

inherit rpm
