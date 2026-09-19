SUMMARY = "Fish Completion for zellij"
DESCRIPTION = "Fish command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.44.3"

RPM_NAME = "zellij-fish-completion-0.44.3-1.4.noarch.rpm"
RPM_HASH = "c3fd40dbc14e219ee291f35e4249612b80a29d91b3c78a5a8394dd7d3c5a9644f509a0b217df0fdaea09f0ce236ba4cec52691adf5b474269a787c4509a0d7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
