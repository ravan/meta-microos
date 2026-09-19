SUMMARY = "Fish Completion for hcloud-cli"
DESCRIPTION = "Fish command line completion support for hcloud-cli."
LICENSE = "MIT"

PV = "1.67.0"

RPM_NAME = "hcloud-cli-fish-completion-1.67.0-1.1.noarch.rpm"
RPM_HASH = "a90e124bf043d01420c6d430d1db6084e7df91beba2fd9b6220f3734fbd12004fe344d986f8c09f561fe673aed88a91d58844f6214b68efcc529a1a4b3778809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hcloud-cli-fish-completion"

RDEPENDS:${PN} += "hcloud-cli"

inherit rpm
