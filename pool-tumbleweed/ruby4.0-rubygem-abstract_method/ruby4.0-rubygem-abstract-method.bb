SUMMARY = "Tiny library enabling you to define abstract methods in Ruby classes"
DESCRIPTION = "Abstract Method is a tiny library enabling you to define abstract methods in \
Ruby classes and modules."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ruby4.0-rubygem-abstract_method-1.2.1-2.43.aarch64.rpm"
RPM_HASH = "fec856ff099802bc5a638f9a8eff5baa4499279fe1965c5dd28245de97bf862688d278a4b18018180b1adbdf66915c1dcac6b4a1451daabb84e64374cfb7a2f9"

RPROVIDES:${PN} += "ruby4.0-rubygem-abstract-method \
rubygem-abstract-method \
rubygem-ruby-4.0.0-abstract-method \
rubygem-ruby-4.0.0-abstract-method-1 \
rubygem-ruby-4.0.0-abstract-method-1.2 \
rubygem-ruby-4.0.0-abstract-method-1.2.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
