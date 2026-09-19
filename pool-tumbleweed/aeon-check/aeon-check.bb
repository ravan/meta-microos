SUMMARY = "Aeon Check and Repair Tool"
DESCRIPTION = "Automatically checks and repairs known issues in Aeon installations at boot"
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "aeon-check-1.0.9-1.3.noarch.rpm"
RPM_HASH = "8052bb961a7d939afe7bd60c050d5e8132b832ab6967fecf564c078b555b05d018b9a175b7e1cbfbddfe6a77bfa4ff414207da0bcdbe171d8d2d79bb7d4593bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aeon-check"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
