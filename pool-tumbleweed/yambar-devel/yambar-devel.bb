SUMMARY = "Development files for yambar"
DESCRIPTION = "Modules for interacting and modifying yambar."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "yambar-devel-1.11.0-3.2.noarch.rpm"
RPM_HASH = "6c3963d7d768c0a4f2fcf8ed67cbd7cbf2e46eee366377514ef06dc1d4926f70292345ff41e2e8b57acb5c7b983f616bd6c6842b49685f6dc1c0c841bbf339bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yambar-devel"

RDEPENDS:${PN} += "yambar"

inherit rpm
