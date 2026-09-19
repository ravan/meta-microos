SUMMARY = "Simple and easy way to know if you're on windows or not (reliably),"
DESCRIPTION = "The OS gem allows for some useful and easy functions, like OS.windows? (=> \
true or false) OS.bits ( => 32 or 64) etc'."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ruby4.0-rubygem-os-1.1.4-1.24.aarch64.rpm"
RPM_HASH = "1172ca27d07bb17e219e21012e7d03b29bdde528fdc8cc9cc47e196cd89e56eea35173e932e2f79030570747223ea2ec172c8237d2e3c56016452a1f30f1740a"

RPROVIDES:${PN} += "ruby4.0-rubygem-os \
rubygem-os \
rubygem-ruby-4.0.0-os \
rubygem-ruby-4.0.0-os-1 \
rubygem-ruby-4.0.0-os-1.1 \
rubygem-ruby-4.0.0-os-1.1.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
