SUMMARY = "Fish Completion for bomctl"
DESCRIPTION = "Fish command line completion support for bomctl."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "bomctl-fish-completion-0.4.3-1.8.noarch.rpm"
RPM_HASH = "7637a9813ca6338397137d6b0af51da3c1368820763b4d117b425077e547bd0ecd6bd8592fbd21f02771c501b7912ba632ab00c2bf2d64ef549f45985804a42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bomctl-fish-completion"

RDEPENDS:${PN} += "bomctl"

inherit rpm
