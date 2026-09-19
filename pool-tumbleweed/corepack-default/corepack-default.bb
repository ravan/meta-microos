SUMMARY = "Default version of corepack"
DESCRIPTION = "Depends on the corepack version associated with the current default \
version of nodejs for the current architecture and codestream."
LICENSE = "MIT"

PV = "6.1"

RPM_NAME = "corepack-default-6.1-5.3.aarch64.rpm"
RPM_HASH = "1c9a5a1be3fab850e874f9ece9c56415c371a15e57066e6a5953f33dca507ac756f50a8cd346290050675145e3e8d64a0b95c14e2fddab278a64cbb39cec7cbc"

RPROVIDES:${PN} += "corepack \
corepack-default"

RDEPENDS:${PN} += "corepack24 \
npm-default"

inherit rpm
