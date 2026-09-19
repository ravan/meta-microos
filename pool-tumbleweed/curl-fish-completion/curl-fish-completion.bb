SUMMARY = "Fish completion for curl"
DESCRIPTION = "Fish command line completion support for curl."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "curl-fish-completion-8.22.0-1.1.noarch.rpm"
RPM_HASH = "1295a2fd9050cf25ee96c9d9bc91349df538f4b5ba6916d57955481329afceadc9840f485218be04afcdd8aa62509fe0efb17c674be902a2ca3f43f51edc1562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "curl-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
