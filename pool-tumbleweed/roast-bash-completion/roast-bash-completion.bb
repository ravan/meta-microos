SUMMARY = "Bash Completion for roast"
DESCRIPTION = "Bash command-line completion support for roast."
LICENSE = "MPL-2.0"

PV = "10.0.2"

RPM_NAME = "roast-bash-completion-10.0.2-1.11.noarch.rpm"
RPM_HASH = "29d354d735d0ed0e45a7de74c1b0841abd08e4027f1a74f2440a383f5cf85a29d056472bd2e3c103f6c4f38dff6be954f1962cc64a32c12ce8c5c8ff89e1694b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "roast-bash-completion"

RDEPENDS:${PN} += "bash-completion \
roast"

inherit rpm
