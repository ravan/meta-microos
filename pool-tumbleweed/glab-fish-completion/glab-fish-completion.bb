SUMMARY = "Fish completion for glab"
DESCRIPTION = "Fish command line completion support for glab."
LICENSE = "MIT"

PV = "1.115.0"

RPM_NAME = "glab-fish-completion-1.115.0-1.1.noarch.rpm"
RPM_HASH = "a7b3274c151a2ddf27b2b4e5e2763e7da6fb4d8507789ff9fa34df8bc1c9298076aec019634436aeea4e7cd86ffcbecbceeddfcc11951320d14ef9a66b91a622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-fish-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
