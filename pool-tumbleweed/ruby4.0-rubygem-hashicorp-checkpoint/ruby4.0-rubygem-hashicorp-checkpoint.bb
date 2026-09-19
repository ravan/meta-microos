SUMMARY = "Internal HashiCorp service to check version information"
DESCRIPTION = "Internal HashiCorp service to check version information."
LICENSE = "MPL-2.0"

PV = "0.1.5"

RPM_NAME = "ruby4.0-rubygem-hashicorp-checkpoint-0.1.5-1.35.aarch64.rpm"
RPM_HASH = "dd0a69cc468d64afc50b45d6489c6ed4a31d8f5798c08ee100aa0c6185f35550b9b38d304bd2619d308f78f51e508d2f5d529df522d675c5c6a8d79bb8cd068b"

RPROVIDES:${PN} += "ruby4.0-rubygem-hashicorp-checkpoint \
rubygem-hashicorp-checkpoint \
rubygem-ruby-4.0.0-hashicorp-checkpoint \
rubygem-ruby-4.0.0-hashicorp-checkpoint-0 \
rubygem-ruby-4.0.0-hashicorp-checkpoint-0.1 \
rubygem-ruby-4.0.0-hashicorp-checkpoint-0.1.5"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
