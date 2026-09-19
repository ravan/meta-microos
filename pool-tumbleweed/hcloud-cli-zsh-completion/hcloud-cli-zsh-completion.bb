SUMMARY = "Zsh Completion for hcloud-cli"
DESCRIPTION = "zsh command line completion support for hcloud-cli."
LICENSE = "MIT"

PV = "1.67.0"

RPM_NAME = "hcloud-cli-zsh-completion-1.67.0-1.1.noarch.rpm"
RPM_HASH = "3d89bfb436f6b9e36143fdadc00874b8770a1ca635238d3cfd22aed3c785fc77a0b4ee371ba853c0cd1aa7cec29cd82ca4bffcdb0cfcd8225bf7c4987c2a6771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hcloud-cli-zsh-completion"

RDEPENDS:${PN} += "hcloud-cli"

inherit rpm
