SUMMARY = "Fish Completion for incus-cli"
DESCRIPTION = "Fish command line completion support for incus-cli."
LICENSE = "Apache-2.0"

PV = "7.4"

RPM_NAME = "incus-cli-fish-completion-7.4-1.1.noarch.rpm"
RPM_HASH = "a815817b0f9c8589a4bb68af46c913103fe63d2059589f804f4c2f0ce759ae1fdb2703dd13fb29b7c029d85f073e8c0050fa9e78daa8ba2c8690618f49a399c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "incus-cli-fish-completion \
incus-fish-completion"

RDEPENDS:${PN} += "incus-cli"

inherit rpm
