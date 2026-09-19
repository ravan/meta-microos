SUMMARY = "System configuration to enforce NoNewPrivs by default"
DESCRIPTION = "This package provides the configuration files and dependencies \
necessary to enforce the no_new_privs kernel flag system-wide. \
When enabled, this flag prevents processes from granting privileges \
that were not already held by their parent. Consequently, setuid and \
setgid binaries will no longer function to elevate permissions."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "enable-no_new_privs-1.1-2.2.noarch.rpm"
RPM_HASH = "6bad3716d3e16169c7ea1724143aac86b4b10fff92d889ae329009863abeb017c57a188795013be5bc4591e11cbb940f574e33404fd47e27e169fd75bf896291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enable-no-new-privs"

RDEPENDS:${PN} += "/usr/bin/sh \
account-utils \
polkit \
run0-policy-wheel-auth-self \
run0-wrappers \
shadow"

inherit rpm
