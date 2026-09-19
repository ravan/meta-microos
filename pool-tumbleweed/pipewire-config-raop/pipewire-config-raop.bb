SUMMARY = "PipeWire configuration enabling the raop module"
DESCRIPTION = "This package contains the configuration files to enable the RAOP module."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-config-raop-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "32118c331d6910facf0a34a4061312c04129a40c84f703eef31caa70a8d3ca38e635ec88095fe8c36cc51d6ca9149a1f22134e2717e0e48eb5ab9e0b5875e153"

RPROVIDES:${PN} += "pipewire-config-raop"

RDEPENDS:${PN} += "libpipewire-0-3-0 \
pipewire"

inherit rpm
