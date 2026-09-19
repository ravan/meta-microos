SUMMARY = "Fish Completion for glow"
DESCRIPTION = "Fish command-line completion support for glow."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "glow-fish-completion-3.0.0-1.1.noarch.rpm"
RPM_HASH = "70acbc2eff4e8c2222f44510af980f6750759398ba1e91c97fefec08e2d26184c2fb3ba88ef9fcb86fa808d49e0553e4beb3435b62d37de64000361e403aafb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glow-fish-completion"

RDEPENDS:${PN} += "fish \
glow"

inherit rpm
