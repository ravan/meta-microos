SUMMARY = "Simple mime type detection using magic numbers, filenames, and"
DESCRIPTION = "Simple mime type detection using magic numbers, filenames, and extensions."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0.4"

RPM_NAME = "ruby4.0-rubygem-marcel-1.0.4-1.11.aarch64.rpm"
RPM_HASH = "e0c52bd80ef541682ec19e0ba3f4e09cb420874e11a6c4fb995207b2c4d29d68217b471591f8139ca56ea5378c33bb1fb6dd2fb4657c51dd9ed19a16da56a98d"

RPROVIDES:${PN} += "ruby4.0-rubygem-marcel \
rubygem-marcel \
rubygem-ruby-4.0.0-marcel \
rubygem-ruby-4.0.0-marcel-1 \
rubygem-ruby-4.0.0-marcel-1.0 \
rubygem-ruby-4.0.0-marcel-1.0.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
