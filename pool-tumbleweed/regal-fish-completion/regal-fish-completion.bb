SUMMARY = "Fish Completion for regal"
DESCRIPTION = "Fish command line completion support for regal."
LICENSE = "Apache-2.0"

PV = "0.42.0"

RPM_NAME = "regal-fish-completion-0.42.0-1.2.noarch.rpm"
RPM_HASH = "887cab6878d3f6f289ebc2946e5f7fc90611e03750ebbd69c47df44a702e50021fd6b80cb54d47524b9497a353bece2b54638b6e6be683a7fc958db274fada0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regal-fish-completion"

RDEPENDS:${PN} += "fish \
regal"

inherit rpm
