SUMMARY = "CSS parser based on the CSS Syntax Level 3 spec"
DESCRIPTION = "Crass is a pure Ruby CSS parser based on the CSS Syntax Level 3 spec."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "ruby4.0-rubygem-crass-1.0.6-1.31.aarch64.rpm"
RPM_HASH = "b278c371141d301a0beedff9643948ec972bc40f036457c21f50112ff267a3e707accb41eb48a939234367eca4aaf5328652156b1209522a44e0c13a6dbf46e5"

RPROVIDES:${PN} += "ruby4.0-rubygem-crass \
rubygem-crass \
rubygem-ruby-4.0.0-crass \
rubygem-ruby-4.0.0-crass-1 \
rubygem-ruby-4.0.0-crass-1.0 \
rubygem-ruby-4.0.0-crass-1.0.6"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
