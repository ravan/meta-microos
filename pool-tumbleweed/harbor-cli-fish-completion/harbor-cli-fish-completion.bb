SUMMARY = "Fish Completion for harbor-cli"
DESCRIPTION = "Fish command line completion support for harbor-cli."
LICENSE = "Apache-2.0"

PV = "0.0.25"

RPM_NAME = "harbor-cli-fish-completion-0.0.25-1.1.noarch.rpm"
RPM_HASH = "5e92602d7e3bc35acef65c749e2b493a34264568d8f5688d943618e29cb5ed85aa1196ab4d639c7ab8626d05162f94bc450d4ed2a30e3b9173e3caadc128ed75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "harbor-cli-fish-completion"

RDEPENDS:${PN} += "harbor-cli"

inherit rpm
