SUMMARY = "Numix Cinnamon Theme"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. \
This package contains the Cinnamon theme."
LICENSE = "AGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "cinnamon-metatheme-numix-3.0-1.20.noarch.rpm"
RPM_HASH = "f9a816b4a3f456bf3e6dc6d20e2b10d836b738c7035be669cbf19ffb9f0cd8798fabc65be82ed5131fcd9a6fdd126cba2f0eafc8b61c4d95a0d25259187eddc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-metatheme-numix"

RDEPENDS:${PN} += "cinnamon \
metatheme-numix-common"

inherit rpm
