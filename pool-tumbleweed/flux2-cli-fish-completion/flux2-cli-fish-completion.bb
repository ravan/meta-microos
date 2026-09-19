SUMMARY = "Fish Completion for flux2-cli"
DESCRIPTION = "Fish command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.9.4"

RPM_NAME = "flux2-cli-fish-completion-2.9.4-1.1.noarch.rpm"
RPM_HASH = "c8a9cc590b71394dcb4b10e56f80501974052316b0bdf1d4aa613a38a8e144e555f1a3c0248587a2797350da903551bb7bef90a5f95bdb0ebbc593ab0192bce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-fish-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
