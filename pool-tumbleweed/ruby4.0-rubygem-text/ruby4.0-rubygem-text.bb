SUMMARY = "A collection of text algorithms"
DESCRIPTION = "A collection of text algorithms: Levenshtein, Soundex, Metaphone, Double \
Metaphone, Porter Stemming."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "ruby4.0-rubygem-text-1.3.1-1.45.aarch64.rpm"
RPM_HASH = "f4a85e408ffcf5b311d93241d55e372219523b60fd9a943959a4b79d2d4daaf5a5a836dea2a5b00ace75ed3d967454d2ad9b59cc8f9902fa37e794a1e86400bc"

RPROVIDES:${PN} += "ruby4.0-rubygem-text \
rubygem-ruby-4.0.0-text \
rubygem-ruby-4.0.0-text-1 \
rubygem-ruby-4.0.0-text-1.3 \
rubygem-ruby-4.0.0-text-1.3.1 \
rubygem-text"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
