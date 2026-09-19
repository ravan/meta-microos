SUMMARY = "Very simple & usable FSEvents API"
DESCRIPTION = "FSEvents API with Signals catching (without RubyCocoa)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "ruby4.0-rubygem-rb-fsevent-0.11.2-1.19.aarch64.rpm"
RPM_HASH = "259d2b37c504e5d8595e518b3396283906258239de0220c90e7b35d27a62c9fe194e7337bcbfb23d582e75032b81fd7ffc8827d7c3331831065d6e0de57069c1"

RPROVIDES:${PN} += "ruby4.0-rubygem-rb-fsevent \
rubygem-rb-fsevent \
rubygem-ruby-4.0.0-rb-fsevent \
rubygem-ruby-4.0.0-rb-fsevent-0 \
rubygem-ruby-4.0.0-rb-fsevent-0.11 \
rubygem-ruby-4.0.0-rb-fsevent-0.11.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
