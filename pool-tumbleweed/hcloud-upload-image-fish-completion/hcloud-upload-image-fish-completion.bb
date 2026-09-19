SUMMARY = "Fish Completion for hcloud-upload-image"
DESCRIPTION = "Fish command line completion support for hcloud-upload-image."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "hcloud-upload-image-fish-completion-1.5.0-1.3.noarch.rpm"
RPM_HASH = "79cf48279a5a26d63c97ff47eedc6c864fb7249a8573b2f949790dbe2fa4a712fb963a05e339362140ac9682e491888ad5f286da808d2129e7e5422b1d867b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hcloud-upload-image-fish-completion"

RDEPENDS:${PN} += "hcloud-upload-image"

inherit rpm
