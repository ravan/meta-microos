SUMMARY = "Fish Completion for melange"
DESCRIPTION = "Fish command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "melange-fish-completion-0.59.2-1.1.noarch.rpm"
RPM_HASH = "dfda5cc71e59c97b7f5dc1214ccbf8e841ce048df4002c214ebe23e301733b544208020bc584730c8b2dcfe0c3d4d9454388c2fca9d21df0ed881834b31f05ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-fish-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
