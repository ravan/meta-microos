SUMMARY = "Fish Completion for reimage"
DESCRIPTION = "Fish command line completion support for reimage."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "reimage-fish-completion-0.15.1-1.2.noarch.rpm"
RPM_HASH = "2db9925d687a7174be195020b66d38a7921d08e45f855aa5f4aa4699bca8117eead79854ef5523eb1ebcd81a63baf5ec3e1444463ac5edba987ed8d9c4b9c61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reimage-fish-completion"

RDEPENDS:${PN} += "reimage"

inherit rpm
