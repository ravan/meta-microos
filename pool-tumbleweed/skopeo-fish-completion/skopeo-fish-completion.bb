SUMMARY = "Fish completion for skopeo"
DESCRIPTION = "This package contains the fish completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.24.0"

RPM_NAME = "skopeo-fish-completion-1.24.0-1.1.noarch.rpm"
RPM_HASH = "d88c2ea5762b2f3c4150b025d0a5582f34be6f05151928bf727239df7616b83f1bb4c8f9bef3967805edcd4f6da27a357afe1ea10eb82d4961589595164925cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-fish-completion"

RDEPENDS:${PN} += "fish \
skopeo"

inherit rpm
