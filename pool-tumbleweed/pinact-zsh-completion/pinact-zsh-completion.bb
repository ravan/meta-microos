SUMMARY = "Zsh Completion for pinact"
DESCRIPTION = "zsh command line completion support for pinact."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "pinact-zsh-completion-4.1.1-1.1.noarch.rpm"
RPM_HASH = "1c3d011ac370920810afef8d12bf17502fe4264cae89d46d86502624a5226f9d46841a913ac7d5f04cc41fd377fc720b58d2a205509e4a10d190f08641ffa69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pinact-zsh-completion"

RDEPENDS:${PN} += "pinact \
zsh"

inherit rpm
