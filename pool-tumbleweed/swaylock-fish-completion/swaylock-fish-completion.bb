SUMMARY = "Fish completion for swaylock"
DESCRIPTION = "Fish command line completion support for swaylock."
LICENSE = "MIT"

PV = "1.8.6"

RPM_NAME = "swaylock-fish-completion-1.8.6-1.2.noarch.rpm"
RPM_HASH = "767304c935a04fbb4d40dc5b0b1ccc73f1deae50a0e7e19faa85f7768cfc43286d1dc71490b0d6771a76cabbbe526dc2fa07e51c3ae904455f85a9f8c4373709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaylock-fish-completion"

RDEPENDS:${PN} += "swaylock"

inherit rpm
