SUMMARY = "A multipart form post accessory for Net::HTTP"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "ruby4.0-rubygem-multipart-post-2.4.1-1.11.aarch64.rpm"
RPM_HASH = "93f3e1072dfaa1d8e31c1b5f3aa9403c59dbb6287e75baa7eeeaf434a4c602d68c687a20bc7126a17bfb39f4c39d82bfd02120d94393fb8fb4f787b1e9af2e9d"

RPROVIDES:${PN} += "ruby4.0-rubygem-multipart-post \
rubygem-multipart-post \
rubygem-ruby-4.0.0-multipart-post \
rubygem-ruby-4.0.0-multipart-post-2 \
rubygem-ruby-4.0.0-multipart-post-2.4 \
rubygem-ruby-4.0.0-multipart-post-2.4.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
