SUMMARY = "Fish Completion for inspektor-gadget"
DESCRIPTION = "Fish command line completion support for inspektor-gadget."
LICENSE = "Apache-2.0"

PV = "0.55.1"

RPM_NAME = "inspektor-gadget-fish-completion-0.55.1-1.1.noarch.rpm"
RPM_HASH = "954d0ed3ef3074367a6d64c6ae8a90488443af4b21354f9d4c0ece52d3fd2ef602ee0a8827f3e6dd8f07894e4411261f3bf5395a72301756877579cb8ca9c210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inspektor-gadget-fish-completion"

RDEPENDS:${PN} += "inspektor-gadget"

inherit rpm
