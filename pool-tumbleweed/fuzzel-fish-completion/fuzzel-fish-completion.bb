SUMMARY = "Fish Completion for fuzzel"
DESCRIPTION = "Fish command-line completion support for fuzzel."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "fuzzel-fish-completion-1.14.0-1.7.aarch64.rpm"
RPM_HASH = "d666ed40b35eed9d8e27911f5f3bb193274a7cbbf8cfc4b98396c4017e8980f653e0e833dbe4c206ea6025abb9d70968e3c4e6454c6bc07e3be51dc43505dd71"

RPROVIDES:${PN} += "fuzzel-fish-completion"

RDEPENDS:${PN} += "fish \
fuzzel"

inherit rpm
