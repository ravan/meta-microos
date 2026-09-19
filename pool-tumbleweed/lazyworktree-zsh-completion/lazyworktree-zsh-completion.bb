SUMMARY = "Zsh Completion for lazyworktree"
DESCRIPTION = "zsh command line completion support for lazyworktree."
LICENSE = "Apache-2.0"

PV = "1.49.0"

RPM_NAME = "lazyworktree-zsh-completion-1.49.0-1.2.noarch.rpm"
RPM_HASH = "dc2128fc1aa1b0f61707351072e103e0e8f7d093baf6a894c850369a96461739919e0cf9576506a16488ba8bbde243d17cf188a3d90430cb36bbfcd75700f155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lazyworktree-zsh-completion"

RDEPENDS:${PN} += "lazyworktree \
zsh"

inherit rpm
