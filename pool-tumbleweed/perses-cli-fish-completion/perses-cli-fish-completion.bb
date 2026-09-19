SUMMARY = "Fish Completion for perses-cli"
DESCRIPTION = "Fish command line completion support for perses-cli."
LICENSE = "Apache-2.0"

PV = "0.54.0"

RPM_NAME = "perses-cli-fish-completion-0.54.0-1.1.noarch.rpm"
RPM_HASH = "6a33a7f5078f6bc5b31f34dee14d868ca0eec1015f4aa70e2f6f65082a7c771e5ccbdfa1b335a71072af5344304c35eeab13014dae877416f2048dbb9c995ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perses-cli-fish-completion"

RDEPENDS:${PN} += "perses-cli"

inherit rpm
