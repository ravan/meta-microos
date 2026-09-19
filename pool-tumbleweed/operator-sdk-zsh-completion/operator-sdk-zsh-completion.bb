SUMMARY = "Zsh Completion for operator-sdk"
DESCRIPTION = "zsh command line completion support for operator-sdk."
LICENSE = "Apache-2.0"

PV = "1.42.3"

RPM_NAME = "operator-sdk-zsh-completion-1.42.3-1.3.noarch.rpm"
RPM_HASH = "07f7ad8c6a64042a904b6b57bf11e01be9e18505367b485946e7fe20c2add13883705d0b908b74c394d5f314ed1f027fbbf7408759b75ddd5f99341b16d38fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "operator-sdk-zsh-completion"

RDEPENDS:${PN} += "operator-sdk"

inherit rpm
