SUMMARY = "Colorize your text in the terminal"
DESCRIPTION = "Colorize your text in the terminal."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-colorator-1.1.0-1.43.aarch64.rpm"
RPM_HASH = "8fa438f6d0bd8869cf85742c8f9f8a9da9c5f228ae47597496daf8c4c00e86191b25d05c578be3adb300a8cf6d7497f9e4f6f0e5d1ec27edb1314600d740e6c7"

RPROVIDES:${PN} += "ruby4.0-rubygem-colorator \
rubygem-colorator \
rubygem-ruby-4.0.0-colorator \
rubygem-ruby-4.0.0-colorator-1 \
rubygem-ruby-4.0.0-colorator-1.1 \
rubygem-ruby-4.0.0-colorator-1.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
