SUMMARY = "Zsh Support for ghostty"
DESCRIPTION = "Zsh support for ghostty."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-zsh-completion-1.3.1-1.6.noarch.rpm"
RPM_HASH = "24b0a691e595bb86b59922f0cec147ea988a2c082355f85d85208ae26f4e12b84b346d3d124e0ccd6e7405c4396bd3b214cf554f810807fa70713e9d59fc59d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-zsh-completion"

RDEPENDS:${PN} += "ghostty \
zsh"

inherit rpm
