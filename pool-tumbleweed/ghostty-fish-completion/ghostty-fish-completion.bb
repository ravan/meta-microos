SUMMARY = "Fish Support for ghostty"
DESCRIPTION = "Fish support for ghostty."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-fish-completion-1.3.1-1.6.noarch.rpm"
RPM_HASH = "1a9d37c3705a5620e7bf4f04becf46ef12994a920e39ed9fa4229c2d167d03b9c85e3e398fa9ad7863e13ce0a6283de0af2708efe00563f9079bb1def90078ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-fish-completion"

RDEPENDS:${PN} += "fish \
ghostty"

inherit rpm
