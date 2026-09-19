SUMMARY = "Timezone Data for TZInfo"
DESCRIPTION = "TZInfo::Data contains data from the IANA Time Zone database packaged as Ruby \
modules for use with TZInfo."
LICENSE = "MIT"

PV = "1.2025.1"

RPM_NAME = "ruby4.0-rubygem-tzinfo-data-1.2025.1-1.9.aarch64.rpm"
RPM_HASH = "6ec09d71505e7213d00e8638e2f694d4498d3ff33bc334cb359fc14ae1af10f8e46a2f5ba3e15d043c14277f6d29dc406e0d6ea4387f1af78e9f96e5ebb38181"

RPROVIDES:${PN} += "ruby4.0-rubygem-tzinfo-data \
rubygem-ruby-4.0.0-tzinfo-data \
rubygem-ruby-4.0.0-tzinfo-data-1 \
rubygem-ruby-4.0.0-tzinfo-data-1.2025 \
rubygem-ruby-4.0.0-tzinfo-data-1.2025.1 \
rubygem-tzinfo-data"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-tzinfo"

inherit rpm
