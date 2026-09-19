SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.24.0"

RPM_NAME = "skaffold-fish-completion-2.24.0-1.2.noarch.rpm"
RPM_HASH = "e8c66194ea8505e71f81f210ea50739575dc130350769e9dd5551e1ced294c4e4a51d7841a21837411af6087d07c406fe4e6aaa44c4fd52a9972c267e2016b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"

RDEPENDS:${PN} += "fish \
skaffold"

inherit rpm
