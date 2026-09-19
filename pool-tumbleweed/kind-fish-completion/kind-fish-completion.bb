SUMMARY = "Fish Completion for kind"
DESCRIPTION = "Fish command line completion support for kind."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "kind-fish-completion-0.33.0-1.1.noarch.rpm"
RPM_HASH = "b551dd73c6ce08d3136a8c0c1326d9b076647efd4a5e837353a55de0ba0e4f56b83483d2c6fdbc97d785c96bed3b80b0b7bc33318fcedab8004ccab8c231390d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kind-fish-completion"

RDEPENDS:${PN} += "kind"

inherit rpm
