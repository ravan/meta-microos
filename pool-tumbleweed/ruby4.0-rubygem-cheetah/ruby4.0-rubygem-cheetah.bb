SUMMARY = "Your swiss army knife for executing external commands in Ruby safely"
DESCRIPTION = "Your swiss army knife for executing external commands in Ruby safely and \
conveniently."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby4.0-rubygem-cheetah-1.0.0-1.25.aarch64.rpm"
RPM_HASH = "be1a1e9430a083216c10289f819e61e7c2c42303bcc02a828e9eff126a57ac0df1b33a765c8a217635621367e7fd475a56018b33625364f66783686835f327d4"

RPROVIDES:${PN} += "ruby4.0-rubygem-cheetah \
rubygem-cheetah \
rubygem-ruby-4.0.0-cheetah \
rubygem-ruby-4.0.0-cheetah-1 \
rubygem-ruby-4.0.0-cheetah-1.0 \
rubygem-ruby-4.0.0-cheetah-1.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-abstract-method-1"

inherit rpm
