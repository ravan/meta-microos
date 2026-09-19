SUMMARY = "Fish Completion for longhornctl"
DESCRIPTION = "Fish command line completion support for longhornctl."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "longhornctl-fish-completion-1.10.0-1.8.noarch.rpm"
RPM_HASH = "9c9c838240b8fdeb2d5ff8ccf9882d5cd2434231f20b4321adc8c963d3a257b54f66349553eaab8acf5a2eb9eb832239284a26c6dba3aaa3205a3055ddf41db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "longhornctl-fish-completion"

RDEPENDS:${PN} += "longhornctl"

inherit rpm
