SUMMARY = "PipeWire media server multirate configuration"
DESCRIPTION = "This package contains the configuration files to support multiple \
sample rates."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-config-rates-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "2eb93ab9e8ebd983a7f1a040c1b15888243edcadd7d23e80348f36eec2d10c067407c606dfe0896d5086fe81f73d644da640e642c7033d539f59ea3cd9b7d151"

RPROVIDES:${PN} += "pipewire-config-rates"

RDEPENDS:${PN} += "libpipewire-0-3-0 \
pipewire"

inherit rpm
