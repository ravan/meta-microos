SUMMARY = "Protect against typical web attacks, works with all Rack apps,"
DESCRIPTION = "Protect against typical web attacks, works with all Rack apps, including \
Rails."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby4.0-rubygem-rack-protection-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "114a33a149b61fb67da6f9bd4033ec6271ec33cc63f420e322b15ff695120bbb078146dff46a4f5e6a03a0e01fff2a058bed29564eb551c824992f4c1e84f5ae"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-protection \
rubygem-rack-protection \
rubygem-ruby-4.0.0-rack-protection \
rubygem-ruby-4.0.0-rack-protection-4 \
rubygem-ruby-4.0.0-rack-protection-4.0 \
rubygem-ruby-4.0.0-rack-protection-4.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64 \
rubygem-ruby-4.0.0-rack"

inherit rpm
