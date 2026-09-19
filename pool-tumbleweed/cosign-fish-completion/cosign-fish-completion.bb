SUMMARY = "Fish Completion for cosign"
DESCRIPTION = "Fish command line completion support for cosign."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "cosign-fish-completion-3.1.2-1.2.noarch.rpm"
RPM_HASH = "7de77cc96f129c70df61b83cde11118f012bd63c645c944eb8ea62a32ecd860a79f81d05bbc054322d4bc471fd7486628bc911b748299dc0ac7e32c4a1a67948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosign-fish-completion"

RDEPENDS:${PN} += "cosign"

inherit rpm
