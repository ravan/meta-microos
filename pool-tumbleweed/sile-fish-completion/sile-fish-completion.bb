SUMMARY = "Fish Completion for sile"
DESCRIPTION = "Fish command-line completion support for sile."
LICENSE = "MIT"

PV = "0.15.13"

RPM_NAME = "sile-fish-completion-0.15.13-2.7.noarch.rpm"
RPM_HASH = "1446fc180c29184e066addd4918fc8660686a400afbd496950a85dcf2597e25502f078a580cb0e017262484a2fed6cd18024c41ac25f6585df5278e384225db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sile-fish-completion"

RDEPENDS:${PN} += "fish \
sile"

inherit rpm
