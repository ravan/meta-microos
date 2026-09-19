SUMMARY = "XML to Hash translator"
DESCRIPTION = "XML to Hash translator."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "ruby4.0-rubygem-nori-2.6.0-1.40.aarch64.rpm"
RPM_HASH = "d599c68589a5c3211445f477bf1203b27f2e04c034785a02f949e0be3e7ba44faaf8c50b09df54d10c88c9dcae8eaad4f5ae96622a06e4d44d1d7c85add1ad70"

RPROVIDES:${PN} += "ruby4.0-rubygem-nori \
rubygem-nori \
rubygem-ruby-4.0.0-nori \
rubygem-ruby-4.0.0-nori-2 \
rubygem-ruby-4.0.0-nori-2.6 \
rubygem-ruby-4.0.0-nori-2.6.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
