SUMMARY = "Fish Completion for ingress2gateway"
DESCRIPTION = "Fish command line completion support for ingress2gateway."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "ingress2gateway-fish-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "b09e6114161ca0393faa3590bf63e00f824105739d9384b9532f261b49e678eefdbb195caae96f4bd6ab5af42181b246e9aba70693c3f587ecda3f7a6c447c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ingress2gateway-fish-completion"

RDEPENDS:${PN} += "fish \
ingress2gateway"

inherit rpm
