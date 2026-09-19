SUMMARY = "Efficient and thread-safe constant autoloader"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics. Each gem \
and application may have their own independent autoloader, with its own \
configuration, inflector, and logger. Supports autoloading, \
reloading, and eager loading."
LICENSE = "MIT"

PV = "2.8.2"

RPM_NAME = "ruby4.0-rubygem-zeitwerk-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "b749fa99db52a0adc48b1426cec4e9bb31d79154d1837dacee7a5c8b6caadc247305da397639d1acc06d653aa6b369085302bae3f66a1d373e58820fefa683dd"

RPROVIDES:${PN} += "ruby4.0-rubygem-zeitwerk \
rubygem-ruby-4.0.0-zeitwerk \
rubygem-ruby-4.0.0-zeitwerk-2 \
rubygem-ruby-4.0.0-zeitwerk-2.8 \
rubygem-ruby-4.0.0-zeitwerk-2.8.2 \
rubygem-zeitwerk"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
